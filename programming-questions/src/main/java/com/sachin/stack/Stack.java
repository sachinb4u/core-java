/**
 * 
 */
package com.sachin.stack;

/**
 * @author sbhosale
 *
 */
public interface Stack<T> {
	T pop();
	T push(T item);
	boolean isEmpty();
	boolean isStackFull();
}
