package dynamicQueue;

public class Queue {
	Node front, rear;

	public boolean isEmpty() {
		return rear == null ? true : false;
	}

	public void enQueue(int data) {
		Node n1 = new Node(data);
		if (rear == null) {
			rear = front = n1;
		} else {
			rear.next = n1;
			rear = n1;

		}
	}

	public int deQueue(int data) throws QEmptyException {
		if (isEmpty()) {
			throw new QEmptyException();
		}
		data = front.data;
		front = front.next;
		return data;
	}
	public String toString() {
		String res = " ";
		Node move = front;
		while (move != rear) {
			res += move.data;
			move = move.next;
		}
		res += move.data;
		return res;
	}
}