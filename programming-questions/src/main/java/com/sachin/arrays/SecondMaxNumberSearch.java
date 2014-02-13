package com.sachin.arrays;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sbhosale
 * Date: 12/5/13
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 *
 * Find second max number from an array.
 */
public class SecondMaxNumberSearch {

    public static void main(String[] args){

        Integer[] arr = {1,32,5,23,44,5};

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length ; i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            }
        }

        System.out.println("Max. : " + max + " ; Second-Max : " + second_max);

        findUsingAPI(arr);
    }


    private static void findUsingAPI(Integer[] arr){
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println("Second Max : " + lst.get(1));
    }
}
