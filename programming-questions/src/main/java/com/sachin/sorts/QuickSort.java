package com.sachin.sorts;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
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
		quickSort(arr, 0, arr.length -1);
		System.out.println("Sorted 1: " + Arrays.toString(arr));
	
		List<Integer> sortList = Arrays.asList(Arrays.copyOf(arr, arr.length)); 
		Collections.sort(sortList);
		System.out.println("Sorted 2: "  + sortList);
		System.out.println(" Is Array Sorted Properly : " + sortList.toString().equals(Arrays.toString(arr)));

	}
	
	
	private static void quickSort(Integer[] arr, int low, int high){
		
		int start = low; 
		int end = high;
		
		int pivot = low + (high - low)/2;
		
		System.out.println(Arrays.toString(arr) + " Pivot : "  + arr[pivot] + " Low : " + low + ", High : " + high + " Pivot : " + pivot);
		
		while(start <= end){
			
			while(arr[start] < arr[pivot]){
				start++;
			}
			
			while(arr[end] > arr[pivot]){
				end--;
			}
			
			if(start <= end){
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		
		//recursion
		
		if(low < end){
			quickSort(arr, low, end);
		}
		
		if(high > start){
			quickSort(arr, start, high);
		}
		
		
	}


	private static void swap(Integer[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

}
