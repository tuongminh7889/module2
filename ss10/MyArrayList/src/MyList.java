package ss10.MyArrayList.src;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[DEFAULT_CAPACITY];
        } else {
            throw new IllegalArgumentException("Cappacity" + capacity);
        }
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Lock " + index);
        } else if (index == elements.length) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }


    public E remove(int index) {
        if (index < 0 && index > elements.length) {
            throw new IllegalArgumentException("Look back Index, may be wrong:" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i--) {
            elements[i] = elements[i + 1];
        }
        elements[size-1]= null;
        size--;
        return element;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }

    public boolean contains(E o) {
        return this.indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                return i;
            }
        }
        return index;
    }

    public boolean add(E e) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newsize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newsize);
        } else {
            throw new IllegalArgumentException("Look back minCapacity" + minCapacity);
        }
    }

    public E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
