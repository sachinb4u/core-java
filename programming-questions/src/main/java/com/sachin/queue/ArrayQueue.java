package com.sachin.queue;

import java.util.Arrays;

/**
 * @author sbhosale
 *
 * Circular Array Implementation of Queue
 */
public class ArrayQueue<E> implements Queue<E> {

	private E[] array;
	private int firstIndex = 0;
	private int lastIndex = -1;
	
	public ArrayQueue(E[] arr){
		array = arr;
	}
	public E poll() {
		if(firstIndex != -1){
			return array[firstIndex];
		}
		return null;
	}

	public boolean offer(E item) {
		if(isQueueFull()){
			return false;
		}
		++lastIndex;
		if(lastIndex > array.length -1 && firstIndex > 0){
			lastIndex = 0;
		}
		array[lastIndex] = item;
		
		return true;
	}

	public E peek() {
		if(isQueueEmpty()){
			return null;
		}
		E item = array[firstIndex];
		array[firstIndex] = null;
		if(firstIndex == lastIndex){
			firstIndex =  0;
			lastIndex = -1;
		}else{
			firstIndex++;
			
			if(firstIndex > array.length -1 && lastIndex > 0){
				firstIndex = 0;
			}
		}
		return item;
	}

	private boolean isQueueFull(){
		if((firstIndex == 0 && lastIndex == array.length -1) || (lastIndex!= -1 && lastIndex +1   == firstIndex)){
			return true;
		}
		return false;
	}
	
	private boolean isQueueEmpty(){
		if(lastIndex == -1 && firstIndex == 0){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(Arrays.toString(array));
		builder.append("{ firstIndex = ");
		builder.append(firstIndex);
		builder.append(", lastIndex =");
		builder.append(lastIndex);
		builder.append(" } ");
		return builder.toString() ;
	}
}
