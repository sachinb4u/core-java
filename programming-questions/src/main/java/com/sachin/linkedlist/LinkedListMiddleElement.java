package com.sachin.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by sbhosale on 12/30/13.
 */
public class LinkedListMiddleElement {

    public static void main(String[] args){

        Integer[] intArr = new Integer[]{2,4,5,8,9,7,33};

        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<Integer>(Arrays.asList(intArr));

        Integer middle = integerMyLinkedList.findMiddle();

        System.out.println("Middle Element = " + middle);


    }



}
