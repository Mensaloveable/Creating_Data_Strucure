package com.loveable.arrayList;

import java.util.Arrays;

public class ArrayListDemo<E> {
    private int[] array;
    private int index;

//    public  ArrayListDemo(){
//        array = new int[10];
//    }

    //    public ArrayListDemo(Collection<? extends E> c, int initialSize) {
    public ArrayListDemo(int initialSize) {
        array = new int[initialSize];
    }

    //get
    public int[] get() {
        return array;
    }

    // add to array
    public void add(int element) {
        if (array.length == index) {
            int[] newArray = new int[index + 1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            array[index] = element;
        } else {
            array[index] = element;
        }
        index++;
    }

    //length of array
    public int length() {
        return index;
    }

    //delete element
    public void delete(int pos) {
        if (pos < index && pos >= 0) {
            int[] newArray = new int[index - 1];
            for (int i = 0, j = 0; i < index; i++) {
                if (pos == i)
                    continue;
                newArray[j] = array[i];
                j++;
            }
            array = newArray;
            index--;
        }
    }

    //find element
    public int find(int pos) {
        int result = -1;
        if (pos < index && pos >= 0) {
            for (int i = 0; i < index; i++) {
                if (pos == i)
                    result = array[i];
            }
        }
        return result;
    }

    // array contains an element
    public boolean contains(int element) {
        for (int i = 0; i < index; i++) {
            if (element == array[i])
                return true;
        }
        return false;
    }

    //find by element
    //delete by element

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
