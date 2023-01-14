package com.loveable;

import com.loveable.arrayList.ArrayListDemo;
import com.loveable.linkedList.LinkedListDemo;

public class Main {


    public static void main(String[] args) {
        Boss faith = new Boss();

        Person aruby = new Person() {
            @Override
            String sing() {
                return "hehhe";
            }
        };

        System.out.println(faith.sing());
        System.out.println(aruby.sing());
    }
}