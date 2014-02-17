/**
 * 
 */
package com.sachin.queue;

/**
 * @author sbhosale
 *
 */
public interface Queue<E> {
	E poll();
	boolean offer(E item);
	E peek();
}
