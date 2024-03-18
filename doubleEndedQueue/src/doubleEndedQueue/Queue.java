package doubleEndedQueue;

import java.util.Iterator;

public class Queue {
	Node front, rear;

	public Queue() {
		front = rear = null;
	}

	public void enQueFront(int data) {
		Node n1 = new Node(data);
		if (front == null && rear == null) {
			front = rear = n1;
		} else {
			n1.next = front;
			front = n1;
		}
	}

	public void enQueueRear(int data) {
		Node n1 = new Node(data);
		if (front == null && rear == null) {
			front = rear = n1;
		} else {
			rear.next = n1;
			rear = n1;
		}
	}

	public boolean isEmpty() {
		return front == null && rear == null ? true : false;
	}

	public int deQueueRear() {
		if (isEmpty()) {
			throw new Queue_Empty_Exception();
		}
		int data;
		Node move = front;
		while (move.next.next != null) {
			move = move.next;
		}
		data = rear.data;
		move.next = null;
		rear = move;
		return data;
	}

	public int deQueueFront() {
		if (isEmpty()) {
			throw new Queue_Empty_Exception();
		}
		int data = front.data;
		front = front.next;
		return data;
	}

	public void display() {
		if (!isEmpty()) {
			Node move = front;
			System.out.println();
			while (move != null) {
				System.out.print(move.data + " ");
				move = move.next;
			}
		}
	}
}
