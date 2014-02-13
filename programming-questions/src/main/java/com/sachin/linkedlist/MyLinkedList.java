package com.sachin.linkedlist;

import java.util.Collection;

/**
 * Created by sbhosale on 1/2/14.
 */
public class MyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    MyLinkedList(){
        head = null;
        tail = null;
    }

    MyLinkedList(T data){
        Node<T> node1 = new Node<T>(null,data,null);
        head = node1;
        tail = node1;
    }

    MyLinkedList(Collection<? extends  T> collection) {
        this();

        addAll(collection);

    }
    public void addAll(Collection<? extends  T> collection){
        if(collection == null || collection.isEmpty()){
            return;
        }

        //Node<T> tmpHead = tail;
        for( T element : collection){
            Node<T> node1 = new Node<T>(tail, element, null);
            if(head == null){
                head = node1;
                tail = node1;
            }
            if(tail != null){
                tail.next = node1;
            }

            tail = node1;
        }
    }

    public void addLast(T element){

    }

    public void addFirst(T element){

    }

    public T findMiddle(){

        Node<T> oneHop = head;
        Node<T> twoHop = head;
        while(twoHop.next != null){
            oneHop = oneHop.next;
            twoHop = twoHop.next.next;

            if(twoHop == null || twoHop.next == null){
                System.out.println("Middle Element is : " + oneHop.data);
                return  oneHop.data;
            }
        }
        System.out.println("No Middle found!");
        return null;
    }


    private static class Node<T>{
        T data;
        Node<T> prev;
        Node<T> next;

        Node(Node<T> previous1, T data1, Node<T> next1){
            this.prev = previous1;
            this.data = data1;
            this.next = next1;
        }
    }
}
