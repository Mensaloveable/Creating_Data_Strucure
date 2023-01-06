package com.loveable.arrayList;

import java.util.Arrays;

// Todo: Make this ArrayList generic
public class ArrayListDemo {
    private int[] array;
    private int index;

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
            for (int i = 0; i < array.length; i++)
                newArray[i] = array[i];
            array = newArray;
        }
        array[index] = element;
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
                if (pos == i) continue;
                newArray[j] = array[i];
                j++;
            }
            array = newArray;
            index--;
        }
    }

    //find element

    /**
     * @param pos is the index in the array
     * @return the element at the particular position id the index exists
     */
    public int find(int pos) {
        int result = -1;
        if (pos < index && pos >= 0) {
            for (int i = 0; i < index; i++) {
                if (pos == i) result = array[i];
            }
        }
        return result;
    }

    // array contains an element

    /**
     * @param element
     * @return
     */
    public boolean contains(int element) {
        for (int i = 0; i < index; i++) {
            if (element == array[i]) return true;
        }
        return false;
    }

    //find by element

    public int findElement(int element) {
        for (int i = 0; i < index; i++) {
            if (element == array[i])
                return i;
        }
        return -1;
    }

    //delete by element
    public void deleteElement(int element) {
        int find = findElement(element);
        if (find >= 0) {
            int[] newArray = new int[index - 1];
            for (int i = 0, j = 0; i < index; i++) {
                if (array[i] == element)
                    continue;
                newArray[j] = array[i];
                j++;
            }
            array = newArray;
            index--;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
