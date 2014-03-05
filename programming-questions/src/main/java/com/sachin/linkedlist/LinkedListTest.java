/**
 * 
 */
package com.sachin.linkedlist;

import java.util.Random;

/**
 * @author sbhosale
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		OrderedLinkedList<Integer> orderedList = new OrderedLinkedList<Integer>();
		
		Random random = new Random();
		
		int[] arr = new int[] {64, 87, 92, 32, 93, 33, 78, 97, 35, 13};
		
		for(int i = 0 ; i < 10; i++){
			int num = random.nextInt(100);
//			num = arr[i];
			System.out.print(num + ", ");
			
			orderedList.insert(num);
			
			//System.out.println("OrderedList : " + orderedList);
		}
		
		System.out.println("\nOrderedList : " + orderedList);
	}

}
