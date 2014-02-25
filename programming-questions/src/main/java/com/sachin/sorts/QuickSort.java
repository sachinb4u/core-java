package com.sachin.sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/**
    function quicksort(array)
     if length(array) = 1
         return array  // an array of zero or one elements is already sorted
     select and remove a pivot element pivot from 'array'  // see '#Choice of pivot' below
     create empty lists less and greater
     for each x in array
         if x = pivot then append x to less
         else append x to greater
     return concatenate(quicksort(less), list(pivot), quicksort(greater)) 
 * 
 * @author sbhosale
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		Random random = new Random();
		
		Integer[] arr = new Integer[10];
		for(int i=0 ; i< 10; i++){
			arr[i] = random.nextInt(100);
		}
		
		System.out.println(Arrays.toString(arr) + " Initial Array : ");
		qSort(arr, 0, arr.length -1);
		System.out.println("Sorted 1: " + Arrays.toString(arr));
	
		List<Integer> sortList = Arrays.asList(Arrays.copyOf(arr, arr.length)); 
		Collections.sort(sortList);
		System.out.println(" *** Sorted 2: "  + sortList);
		System.out.println(" Is Array Sorted Properly : " + sortList.toString().equals(Arrays.toString(arr)));

	}
	
	
	private static void qSort(Integer[] arr, int lo, int hi){
		System.out.println("Q-Sort - " + Arrays.toString(arr) + " lo : " + lo + " , hi : " + hi);
		if(hi <= lo) return;
		
		int pivotIndex = partition(arr, lo, hi);
		
		qSort(arr, lo, pivotIndex -1);
		qSort(arr, pivotIndex +1, hi);
	}
	
	
	private static int partition(Integer[] arr, int lo, int hi) {
		
		int pivot = arr[lo];
		
		int i=lo, j = hi+1;
		
		while(true){
			while(less(arr[++i], pivot)) if(i == hi) break;
			while(less(pivot, arr[--j])) if(j == lo) break;
			if(i >= j) break;
			swap(arr, i, j);
		}
		swap(arr, lo, j);
		System.out.println("PivotIndex  : " + j + " , Pivot : " + arr[j]);
		return j;
	}

	private static boolean less( int a, int b){
		return a < b ? true: false;
	}

	private static void swap(Integer[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

}
