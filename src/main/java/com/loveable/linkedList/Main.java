package com.loveable.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();
        System.out.println(linkedList);
        linkedList.addLast(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        System.out.println(linkedList);
    }
}
