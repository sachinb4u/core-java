package com.sachin.sorts;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {

		Random random = new Random();

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = random.nextInt(100);
		}
		System.out.println("Initial >> " + Arrays.toString(arr));
		System.out.println("Final >> " + Arrays.toString(mergeSort(arr)));

	}

	private static int[] mergeSort(int[] arr) {

		if (arr.length < 2)
			return arr;

		if (arr.length == 2) {
			if (arr[0] > arr[1]) {
				int tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
			}
			return arr;
		}

		int lo = 0, hi = arr.length;
		int mid = lo + (hi - lo) / 2;

		int[] left = Arrays.copyOfRange(arr, lo, mid);
		int[] right = Arrays.copyOfRange(arr, mid, hi);
		
		System.out.println("Sort : " + Arrays.toString(arr) + " , Left : " + Arrays.toString(left) + " , Right : " + Arrays.toString(right) + " , mid = " + mid);
		
		return merge(mergeSort(left), mergeSort(right));

	}

	private static int[] merge(int[] left, int[] right) {

		int[] arr = new int[left.length + right.length];

		int i = 0, j = 0, k = 0;
		while (k < arr.length) {
			// compare two array elements till any one exhausts
			if (i < left.length && j < right.length) {
				if (left[i] <= right[j]) {
					arr[k] = left[i++];
					k++;
				} else {
					arr[k] = right[j++];
					k++;
				}
			}
			// if left has exhausted, add right element and increment
			if (i >= left.length) {
				arr[k] = right[j++];
				k++;
			// if right has exhausted, add left element and increment
			} else if (j >= right.length) {
				arr[k] = left[i++];
				k++;
			}
		}
		System.out.println("Merge : " + Arrays.toString(left) + " + " + Arrays.toString(right) + " = " + Arrays.toString(arr));

		return arr;
	}

}
