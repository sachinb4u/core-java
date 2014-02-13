package com.sachin.arrays;

import java.util.Arrays;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * 16) Write program to sort an integer array without using API methods?
 * 
 * @author sbhosale
 * 
 */
public class ArraySort {

	public int[] bubbleSortOptimized(int[] arr) {

		boolean swapped = true;
		for (int j = 0; j < arr.length - 1 && swapped; j++) {
			System.out.println("Pass : " + (j+1));
			swapped = false;
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					swapped = true;
				}
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
		return arr;
	}
	
	public int[] bubbleSort(int[] arr) {

		boolean swapped = true;
		int pass = 1;
		while(swapped){
			System.out.println("Pass : " + pass++);
			swapped = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					swapped = true;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
		return arr;
	}

	public static class ArraySortTest {
		ArraySort arraySort;
		int[] arr = { 23, 1, 3, 52, 12, 5, 8,78 };
		int[] expected = { 1, 3, 5, 8, 12, 23, 52,78 };

		@BeforeClass
		public void setup() {
			arraySort = new ArraySort();
		}

		@Test
		public void testBubbleSort() {
			int[] result = arraySort.bubbleSortOptimized(arr);
			Assert.assertTrue(Arrays.equals(result, expected));
		}
	}

}
