package com.loveable.arrayList;

import java.util.Arrays;

/**
 * Represents an employee.
 *
 * @author Abdullahi Adedayo
 * @version 1.0
 * @since Jan-06-2023
 */

public class ArrayListDemo {
    private int[] array;
    private int index;

    public ArrayListDemo(int initialSize) {
        array = new int[initialSize];
    }

    /**
     * @return a static array of the ArrayListDemo
     */
    public int[] get() {
        return array;
    }

    /**
     * @param element is the element to be added to the ArrayListDemo
     */
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

    /**
     * @return the length of the Array
     */
    public int length() {
        return index;
    }

    /**
     * @param pos is the index of the element to be deleted
     */
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

    /**
     * @param pos is the index in the array
     * @return the element at the particular position if the index exists
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

    /**
     * @param element is the searched item
     * @return true if element exists and false if otherwise
     */
    public boolean contains(int element) {
        for (int i = 0; i < index; i++) {
            if (element == array[i]) return true;
        }
        return false;
    }

    /**
     * @param element is the searched item
     * @return the index of the element if element exists in the array and returns -1 if otherwise
     */
    public int findElement(int element) {
        for (int i = 0; i < index; i++) {
            if (element == array[i])
                return i;
        }
        return -1;
    }

    /**
     * @param element is the item to be deleted from the Array
     */
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
