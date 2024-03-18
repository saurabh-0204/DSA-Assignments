package queue_Using_Array;

public class IntQueue {
	private int size, rare, front;
	int arr[];

	public IntQueue(int size) {
		this.size = size;
		rare = front = -1;
		arr = new int[size];
	}

	public IntQueue() {
		rare = front = -1;
		size = 3;
		arr = new int[size];
	}

	private boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isFull() {
		if (rare == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(int data) {
		if (!isFull()) {
			if (front == -1) {
				front = 0;
			}
			rare = rare + 1;
			arr[rare] = data;
		} else
			System.out.println(" Queue Is Full ");

	}

	public int deQueue() {
		int data = -9999;
		if (!isEmpty()) {
			data = arr[front];
			if (front == rare) {
				front = rare = -1;
			} else {
				front++;
			}
		}
		return data;
	}
	public void displayLinear() {
		if (isEmpty()) {
			System.out.println("*******Empty Queue********");
		} else {
			System.out.println("  -> " + rare);
			System.out.println("  -> " + front);
			for (int i = front; i < arr.length; i++)
				System.out.print("  " + arr[i]);
			System.out.println();
		}
	}
}
