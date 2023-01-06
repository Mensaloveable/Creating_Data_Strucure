package com.loveable;

import com.loveable.arrayList.ArrayListDemo;

import java.util.Arrays;

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
        System.out.println("Find method " + ans);
        boolean contain = myArray.contains(90);
        System.out.println(contain);
        int index = myArray.findElement(30);
        System.out.println("index of 30 is " + index);
        index = myArray.findElement(300);
        System.out.println("index of 300 is " + index);
        myArray.deleteElement(30);
        System.out.println(myArray);
        System.out.println(myArray.length());
        ArrayListDemo newArray = myArray;
        System.out.println(newArray);
    }
}