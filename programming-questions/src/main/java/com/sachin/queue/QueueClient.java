/**
 * 
 */
package com.sachin.queue;

import java.util.Random;

/**
 * @author sbhosale
 *
 */
public class QueueClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		arrayQueueTest();
	}

	private static void arrayQueueTest() {
		
		Integer[] arr = new Integer[5];
		
		Queue<Integer> arrayQueue = new ArrayQueue<Integer>(arr);
		
		Random rand = new Random();
		for(int i = 0; i < 3 ; i++){
			Integer pushed = rand.nextInt();
			if(arrayQueue.offer(pushed)){
				System.out.println("Pushed : " + pushed);
			}else{
				System.out.println("Pushed : " + pushed + " failed!");
			}
		}
		
		System.out.println(arrayQueue);
		
		for(int i = 0; i < 2 ; i++){
			Integer popped = arrayQueue.peek();
			System.out.println("Popped : " + popped);
		}
		
		System.out.println(arrayQueue);
		
		for(int i = 0; i < 5 ; i++){
			Integer pushed = rand.nextInt();
			if(arrayQueue.offer(pushed)){
				System.out.println("Pushed : " + pushed);
			}else{
				System.out.println("Pushed : " + pushed + " failed!");
			}
		}
		
		System.out.println(arrayQueue);
	}

}
