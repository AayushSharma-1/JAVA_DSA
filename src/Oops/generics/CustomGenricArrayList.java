package Oops.generics;

import java.util.Arrays;

public class CustomGenricArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenricArrayList() {
        this.data = new Object[DEFAULT_SIZE];

    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array

        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public T remove(){
        T removed =(T) (data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenricArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomGenricArrayList list = new CustomGenricArrayList();
//        list.add(3); 
//        list.add(4);
//        list.add(89);
//        for (int i = 0; i < 14; i++) {
//            list.add(2*i);
//        }
        CustomGenricArrayList<Integer> list3 = new CustomGenricArrayList<>();
        for (int i = 0 ; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);


    }
}
