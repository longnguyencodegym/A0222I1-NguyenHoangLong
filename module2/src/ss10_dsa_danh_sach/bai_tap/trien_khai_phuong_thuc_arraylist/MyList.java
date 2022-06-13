package ss10_dsa_danh_sach.bai_tap.trien_khai_phuong_thuc_arraylist;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;
    MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    MyList(int capacity){
        elements = new Object[capacity];
    }
    private void ensureCapa(){
        int newSize =elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    void addFirst(E element){
        if(size==0){
            elements[0]=element;
        }
        else{
            if(size == elements.length){
                ensureCapa();
            }
            for (int i = size-1; i >=0 ; i--) {
                elements[i+1] = elements[i];
            }
            elements[0] = element;
        }
        size++;
    }
    void addLast(E element){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++]= element;
    }
    void add(int index , E element) {
        final  int INDEX = index - 1;
        if (index == 1) {
            addFirst(element);

        } else if (index == elements.length) {
            addLast(element);
        } else {
            for (int i = size-1; i >= INDEX; i--) {
                elements[i + 1] = elements[i];
            }
            elements[INDEX] = element;
            size++;
        }
    }
    public E remove(int index){
        for (int i = index-1; i <size ; i++) {
            elements[i] = elements[i+1];
        }
        size--;
        return  (E) elements[index];
    }
    public int size(){
        return  size;
    }
    boolean contains(E o){
        boolean flg = false;
        for (int i = 0; i <size ; i++) {
            if(elements[i]==o){
                flg = true;
                break;
            }
        }
        return flg;

    }
    public  E clone1(){
        if(size==0){
            System.out.println("Not thing!");
        }
        else {
            Object[] element = new Object[size];
            for (int i = 0; i <size ; i++) {
                element[i] = elements[i];
            }
        }
        return (E) elements;
    }
    int indexOf(E o){
        boolean flg = false;
        int index = -1;
        for (int i = 0; i <size ; i++) {
            if(elements[i]==o){
                flg=true;
                index = i;
                break;
            }
        }
        if(flg){
            return index;
        }
        else {
            return index;
        }
    }
    public E get(int i){
        if(i<0 && i>size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
    void clear(){
        for (int i = 0; i <size ; i++) {
            elements[i] = null;
        }
    }
    public void printList() {
        for (int i = 0; i <size ; i++) {
            System.out.println((i+1)+" : "+elements[i]);
        }
    }

}