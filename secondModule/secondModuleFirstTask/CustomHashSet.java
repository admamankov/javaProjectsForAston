package secondModuleFirstTask;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;

public class CustomHashSet<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private LinkedList<T>[] buckets;

    public CustomHashSet() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
    }

    private int hash(T key) {
        return Math.abs(key.hashCode()) % buckets.length;
    } 

    public void add(int key) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(T key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].remove(key);
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        return buckets[index] != null && buckets[index].contains(key);
    }

    @Override
    public String toString() {
        return "CustomHashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomHashSet<?> that = (CustomHashSet<?>) o;
        return Objects.deepEquals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(buckets);
    }
}
