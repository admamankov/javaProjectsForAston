package secondModuleFirstTask;


import java.util.Arrays;
import java.util.Objects;


public class CustomArrayList<E> {
    private int size;
    private Object[] data;

    public CustomArrayList() {
        this(10);
    }

    public CustomArrayList(int initCapacity) {
        if (initCapacity > 0) {
            this.data = new Object[initCapacity];
        } else if (initCapacity == 0) {
            this.data = new Object[10];
        } else {
            throw new IllegalArgumentException("Illegal capacity: " + initCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public E get(int index) {
        checkIndex(index);
        return (E) data[index];
    }

    public boolean add(E item) {
        ensureCapacity();
        data[size++] = item;
        return true;
    }

    public void add(E item, int index) {
        checkIndex(index);
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = item;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);
        Object item = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return (E) item;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            int oldCapacity = data.length;
            int newCapacity = (oldCapacity * 3) / 2 + 1;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public void addAll(CustomArrayList<E> other) {
        for (int i = 0; i < other.size; i++) {
            add((E) other.data[i]);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayList<?> that = (CustomArrayList<?>) o;
        return size == that.size && Objects.deepEquals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.hashCode(data));
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(data) +
                '}';
    }

}
