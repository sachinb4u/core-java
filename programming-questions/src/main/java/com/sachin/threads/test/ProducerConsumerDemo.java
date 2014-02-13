package com.sachin.threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sbhosale on 1/7/14.
 */
public class ProducerConsumerDemo {

}

class Producer<T> implements Runnable {

	List<T> queue;

	Producer(List<T> inputRack) {
		queue = inputRack;
	}

	public void run() {
		// TODO Auto-generated method stub

	}

}

class Consumer<T> implements Runnable {

	List<T> queue;

	Consumer(List<T> inputRack) {
		queue = inputRack;
	}

	public void run() {
		// TODO Auto-generated method stub

	}
}
