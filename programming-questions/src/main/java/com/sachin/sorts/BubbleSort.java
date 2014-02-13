package com.sachin.sorts;

import java.util.Arrays;

/**
 * Created by sbhosale on 1/3/14.
 *
 * http://stackoverflow.com/questions/16195092/optimized-bubble-sort-java
 * 
 * http://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Bubble_sort#Java
 *
 */
public class BubbleSort{
	
	public static void main(String[] args) {
		Integer[] arr = { 23, 1, 3, 52, 12, 5, 8,78 };
		
		System.out.println(sort(arr));
	}

    /**
     * Bubble sort with optimization.
     *
     * @param arr
     * @param <E>
     * @return
     */
    public static final <E extends Comparable<? super E>> E[] sort(E[] arr){

		boolean swapped = true;
		for (int i = arr.length - 1; i > 0 && swapped; i--) {
			swapped = false;
			for (int j = 0; j < i; j++) {
				if (arr[j].compareTo(arr[j+1]) > 0) {
					swap(arr, j, j + 1);
					swapped = true;
				}
			}
			System.out.println("Pass : " + i + " " + Arrays.toString(arr));
		}

		return arr;    	
    }

    /**
     * Swap elements in array.
     * 
     * @param array
     * @param index1
     * @param index2
     */
    private static <T> void swap(T[] array, int index1, int index2){
    	T tmp = array[index1];
    	array[index1] = array[index2];
    	array[index2] = tmp;
    }
}
