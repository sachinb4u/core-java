package com.sachin.sorts;

/**
 * Created by sbhosale on 1/3/14.
 */
public class InsertionSort {


    public static <E extends Comparable<? super E>> E[] sort(E[] arr) {
        if(arr == null || arr.length <2){
            return arr;
        }

        int length = arr.length;

        for(int i = 1; i< length ; i++){
            E tmp = arr[i];

            for(int j = i - 1 ; j >= 0 && arr[i].compareTo(arr[j]) < 0 ; j-- ){
                System.out.print("i:(" +i+ "), j:(" + j+") = " +arr[i] + " , " + arr[j]);
//                if(arr[j].compareTo(arr[j+1]) > 0){
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
//                }
                System.out.print("  =>   [" + arr[j] + " , " + arr[j+1] + "]\n");
            }
        }

        return arr;
    }
}
