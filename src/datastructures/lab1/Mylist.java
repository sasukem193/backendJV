package datastructures.lab1;

import java.util.Arrays;

public class Mylist<E> {
    private int size=2;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public Mylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(int scale){
        int newSize = elements.length*scale;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e){
        if(size == elements.length){
            ensureCapa(2);
        }
        elements[size++]= e;
    }

    public E get(int i){
        if (i>= size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
