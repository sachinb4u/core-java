package com.sachin.sorts;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by sbhosale on 1/3/14.
 */
public class InsertionSort {

    public static void main(String[] args) {

    	Random rand = new Random();
    	int[] array = new int[10];
    	for(int i= 0 ; i < 10;i++){
    		array[i] = rand.nextInt(100);
    	}
    	
    	System.out.println(Arrays.toString(array));
    	sort(array);
    	System.out.println(Arrays.toString(array));
    }
    
    private static void sort(int[] arr){
    	for(int i = 0 ; i < arr.length; i++){
    		 for(int j = i; j > 0 && arr[j -1] > arr[j]; j--){
    			 swap(arr, j-1, j);
    		 }
    		 System.out.println(Arrays.toString(arr) + " Key = " + arr[i] );
    	}
    	
    }
    
	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
}
