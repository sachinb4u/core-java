package com.sachin.sorts;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int[] arr = new int[10];
		for(int i=0 ; i< 10; i++){
			arr[i] = random.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr));

	}
	
	
	private static int[] quickSort(int[] arr){
		if(arr.length < 2) return arr;
		
		int pivot = arr.length / 2;
		
		int[] lesser = new int[pivot];
		int[] greater = new int[arr.length - pivot];
		
		for(int i = 0; i < arr.length; i++){
			
		}
		
		return arr;
	}

}
