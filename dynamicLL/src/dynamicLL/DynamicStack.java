package dynamicLL;

public class DynamicStack {
	Node top;

	public DynamicStack() {
		top = null;
	}

	public boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int data) {
		Node n1 = new Node(data);
		if (top == null) {
			top = n1;
		} else {
			n1.setNext(top);
			top = n1;
		}
	}

	public int pop() throws StackEmptyException {
		int data = 0;
		if (isEmpty())
			throw new StackEmptyException("No data available ");
		else {
			data = top.getData();
			top = top.getNext();

		}
		return data;
	}

	public void display() {
		Node move;
		for (move = top; move != null; move = move.getNext())
			System.out.println(move.getData());
		;
	}
}
