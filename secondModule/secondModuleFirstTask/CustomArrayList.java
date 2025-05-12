package secondModuleFirstTask;

import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList<E> {
    private int size;
    private Object[] data;
    private static final int DEFAULT_CAPACITY = 10;
    
    public CustomArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public CustomArrayList(int initialCapacity) {
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal capacity: " + initialCapacity);
        data = new Object[initialCapacity];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);
        return (E) data[index];
    }

    public boolean add(E item) {
        ensureCapacityInternal(size + 1);
        data[size++] = item;
        return true;
    }

    public void add(E item, int index) {
        checkIndexForAdd(index);
        ensureCapacityInternal(size + 1);

        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = item;
        size++;
    }

    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        checkIndex(index);
        E oldValue = (E) data[index];

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(data, index + 1, data, index, numMoved);

        data[--size] = null; 

        maybeShrinkSize();

        return oldValue;
    }

    private void maybeShrinkSize() {
        int currentCapacity = data.length;
        if (size < currentCapacity / 2 && currentCapacity > DEFAULT_CAPACITY) {
            int newCapacity = Math.max(DEFAULT_CAPACITY, size);
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity > data.length)
            grow(minCapacity);
    }

    private void grow(int minCapacity) {
        int oldCapacity = data.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1); // увеличиваем на 50%
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        data = Arrays.copyOf(data, newCapacity);
    }

    public void addAll(CustomArrayList<E> other) {
        if (other == null) return;
        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomArrayList)) return false;
        CustomArrayList<?> that = (CustomArrayList<?>) o;
        return size == that.size &&
                Arrays.equals(Arrays.copyOf(data, size), Arrays.copyOf(that.data, that.size));
    }

    public void trimToSize() {
        if (size < data.length) {
            data = Arrays.copyOf(data, size);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(size, Arrays.hashCode(Arrays.copyOf(data, size)));
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(data) +
                '}';
    }

}
