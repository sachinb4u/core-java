package com.sachin.stack;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class StackClient {
	
	public static void main(String[] args) {
		
//		final Stack<Integer> stack = new ArrayStack<Integer>(new Integer[10]);
		final Stack<Integer> stack = new LinkedListStack<Integer>();
		final AtomicBoolean flag = new AtomicBoolean(true);
		Thread producer = new Thread("Producer"){
			public void run() {
				Random random = new Random();
				for(int i=0; i < 10; i++){
					Integer item = random.nextInt();
					stack.push(item);
					System.out.println(" Thread : " + Thread.currentThread().getName() + " pushed item > " + item);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						e.printStackTrace();
					}
				}
			};
		};
		
		Thread consumer = new Thread("Consumer"){
			public void run() {
				for(int i=0; i < 10; i++){
					Integer item = stack.pop();
					System.out.println(" Thread : " + Thread.currentThread().getName() + " popped item > " + item);
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
						e.printStackTrace();
					}
				}
			};
		};
		
		producer.run();
		System.out.println(stack);
		consumer.run();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		flag.set(false);
		System.out.println(stack);
		System.out.println("Exiting Main()");
	}

}
