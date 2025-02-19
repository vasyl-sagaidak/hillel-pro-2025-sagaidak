package lesson_14_Collections_Framework.training.my_arrayList;

import java.util.Deque;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] values;
    private int size;

    public ArrayList() {
        values = (T[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T value) {
        ensureCapacity();
        values[size++] = value;
    }

    @Override
    public void add(T value, int index) {
        checkIndex(index, size + 1);
        ensureCapacity();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = value;
        size++;
    }

    @Override
    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            ensureCapacity();
            add(list.get(i));
        }
    }

    @Override
    public T get(int index) {
        checkIndex(index, size);
        return values[index];
    }

    @Override
    public void set(T value, int index) {
        checkIndex(index, size);
        values[index] = value;
    }

    @Override
    public T remove(int index) {
       checkIndex(index, size);
       T removedValue = values[index];
       System.arraycopy(values, index + 1, values, index, size - index - 1);
       size--;
       return removedValue;
    }

    @Override
    public T remove(T element) {
        for (int i = 0; i < values.length; i++) {
            if (valuesEqualityCheck(values[i],element)) {
                return remove(i);
            }
        }
        throw new NoSuchElementException(
                "There is no such element in array: " + element);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (values.length == size) {
            T[] newArray = (T[]) new Object[values.length + (values.length >> 1)];
            System.arraycopy(values, 0, newArray, 0, size);
            values = newArray;
        }
    }

    private void checkIndex(int index, int size) {
        if (index < 0 || index > size - 1) {
            throw new ArrayListIndexOutOfBoundsException("Index" + index
                    +" is out of bounds.");
        }
    }

    private boolean valuesEqualityCheck(T a, T b) {
        return a == b || a != null && a.equals(b);
    }
}
