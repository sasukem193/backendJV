package datastructures.arraylist;
import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void add(int index, E element){
        for(int i=size-1; i>= index; i--){
            elements[i+1]=elements[i];
        }
        elements[index]= element;
//        size++;
    }

//    public E remove(int index){
//        for(int i= index; i< size-1;i++){
//            elements[i]= elements[i+1];
//        }
//        elements[size-1] = null;
//        size--;
//    }

    public int size(){
        return this.size;
    }

    public E clone(){
        Object[] cloneArr;
        cloneArr = Arrays.copyOf(elements, size);
        return (E) cloneArr;
    }

    public boolean contains (E o){
        for(int i=0; i< size;i++)
            if (elements[i]==o)
            return  true;
            return false;

    }

    public int indexOf(E o){
        for(int i=0;i<size;i++)
            if(elements[i]==o)
                return i;
            return -1;
    }

    public E get(int i){
        return (E) elements[i];
        }


    public void clear (){}





}
