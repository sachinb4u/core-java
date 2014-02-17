package com.sachin.stack;

import java.util.Arrays;

import com.sachin.annotations.NotThreadSafe;

/**
 * 
 * @author sbhosale
 *
 * @param <T>
 */
@NotThreadSafe
public class ArrayStack<T> implements Stack<T> {

	private T[] array;
	private int top; 
	
	public ArrayStack(T[] inArr){
		if(inArr == null) throw new IllegalArgumentException("Null Array");
		array = inArr;
		top = -1;
	}
	
	public T pop() {
		T item = null;
		if(!isEmpty()){
			item = array[top];
			array[top] = null;
			top--;
		}
		return item;
	}

	public T push(T item) {
		if(!isStackFull()){
			++top;
			array[top] = item;
			return item;
		}
		return null;
	}

	public boolean isEmpty() {
		if(top < 0){
			return true;
		}
		return false;
	}
	
	public boolean isStackFull(){
		if(top < array.length -1){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
