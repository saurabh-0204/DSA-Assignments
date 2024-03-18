package stack_Int;

public class StackInt {
	private int top;
	private int size;
	private int arr[];

	public StackInt(int size) {
		top = -1;
		this.size = size;
		arr = new int[this.size];
	}

	public StackInt() {
		size = 10;
		top = -1;
		arr = new int[size];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	public boolean isFull(int data) {
		if (top == size - 1) {
			return true;
		} else
			return false;

	}

	public int peek() {
		int data = -9999;
		if (!isEmpty()) {
			return data = arr[top];
		}
		return data;

	}

	public int pop() {

		int data = -9999;
		if (!isEmpty()) {
			data = arr[top];
			top--;

		}
		return data;

	}

	public void push(int data) {
		if (!isFull(data)) {
			top++;
			arr[top] = data;

		} else {
			System.out.println(".....Stack is overflow....");
		}
	}

	public void display() {
		System.out.println("----------- Stack Is ---------");
		for (int i = top; i >= 0; i--)
			System.out.println("\t" + arr[i]);

	}

}
