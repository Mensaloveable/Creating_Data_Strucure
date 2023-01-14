package com.loveable.linkedList;

public class LinkedListDemo {
    private class Node{
        int element;
        Node next;
        Node(int element){
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }
    private Node head;
    private Node tail;

    //Todo: addLast
    public void addLast(int element) {
        Node node = new Node(element);
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
    }
    //Todo: addFirst
    public void addFirst(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    //Todo: indexOf
    //Todo: contains
    //Todo: size

    @Override
    public String toString() {
        return "LinkedListDemo{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}

