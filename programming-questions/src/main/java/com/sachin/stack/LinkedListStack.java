/**
 * 
 */
package com.sachin.stack;

/**
 * @author sbhosale
 *
 */
public class LinkedListStack<T> implements Stack<T> {

	private Node<T> top;
	
	public LinkedListStack(){
	}
	
	public T pop() {
		Node<T> popped = top;
		top = popped.prev;
		return popped.item;
	}

	public T push(T item) {
		Node<T> node = new Node<T>(item);
		node.prev = top;
		top = node;
		return item;
	}

	public boolean isEmpty() {
		return top == null ? true : false;
	}

	public boolean isStackFull() {
		return false;
	}

	private static class Node<E>{
		E item;
		Node<E> prev;
		
		public Node(E val){
			item = val;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node<T> pointer = top;
		if(pointer != null){
			while(pointer != null){
				builder.append(pointer.item);
				builder.append(" -> ");
				pointer = pointer.prev;
			}
		}
		return builder.toString();
	}
}
