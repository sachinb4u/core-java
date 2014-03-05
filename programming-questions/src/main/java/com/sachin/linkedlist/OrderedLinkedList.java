package com.sachin.linkedlist;

/**
 * Write a program for ordered linked list
 * 
 * whenever element is inserted, it should be stored in sorted manner.
 * 
 * @author sbhosale
 *
 * @param <V>
 */
public class OrderedLinkedList<V extends Comparable<V>> {

	private Node<V> head;

	public void insert(V item) {
		Node<V> newNode = node(item);

		if (head == null) {
			head = newNode;
			return;
		}
		Node<V> current = head;
		while (current.item.compareTo(item) < 0) {
			if (current.next != null) {
				current = current.next;
			} else {
				break;
			}
		}

		// current points to the node which is greater than item to be
		// inserted.
		if (current.item.compareTo(item) > 0) {
			newNode.next = current.next;
			newNode.item = current.item;

			current.item = item;
			current.next = newNode;

			if (current == head) {
				head = current;
			}
		} else {
			newNode.next = current.next;
			current.next = newNode;

			if (current == head) {
				head = current;
			}
		}

	}

	private Node<V> node(V item) {
		return new Node<V>(item, null);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");

		Node<V> current = head;
		while (current != null) {
			builder.append(current.item);
			builder.append(", ");
			current = current.next;
		}
		builder.append("]");

		return builder.toString();
	}

	private static class Node<T extends Comparable<T>> {
		T item;
		Node<T> next;

		public Node(T item1, Node<T> next1) {
			this.item = item1;
			this.next = next1;
		}
	}
}
