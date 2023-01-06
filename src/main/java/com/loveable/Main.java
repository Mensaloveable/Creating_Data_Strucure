package com.loveable;

import com.loveable.arrayList.ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayListDemo myArray = new ArrayListDemo(3);

        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);
        myArray.add(50);
        myArray.add(60);
        System.out.println(myArray);
        System.out.println(myArray.length());
        myArray.delete(4);
        System.out.println(myArray);
        System.out.println(myArray.length());
        int ans = myArray.find(4);
        System.out.println(ans);
        boolean contain = myArray.contains(90);
        System.out.println(contain);


























//        int [] array = new int[3];
//        array[0] = 10;
//        array[1] = 20;
//        array[2] = 30; //[10, 20, 30]
//        int [] newArray = new int[4];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//            System.out.printf("newArray index %d = %d%n", i, newArray[i]);
//        }

//        System.out.println(Arrays.toString(newArray));


//        System.out.println(Arrays.toString(array));
//
//        List<Integer> array2 = new ArrayList<>();
//        array2.add(5); //first element index 0
//        array2.add(9); //
//        System.out.println(array2);

        /**
        String normalString = "YI5ImaZG";
        for (int i = 0; i < normalString.length(); i++) {
            System.out.println(normalString.charAt(i));
        }
         */
    }
}