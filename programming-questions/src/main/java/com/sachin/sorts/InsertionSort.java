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
    	for(int i = 1 ; i < arr.length; i++){
    		int j;
    		 int key = arr[i];
    		 for(j = i-1; j >= 0 && arr[j] > key; j--){
    			 arr[j+1] = arr[j];
    		 }
    		 arr[j+1] = key;
    		 System.out.println(Arrays.toString(arr) + " Key = " + key );
    	}
    	
    }
}
