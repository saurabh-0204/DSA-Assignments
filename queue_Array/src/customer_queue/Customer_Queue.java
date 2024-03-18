package customer_queue;

public class Customer_Queue {
	int size, front, rare;
	Customer arr[];

	public Customer_Queue(int size) {
		super();
		this.size = size;
		rare = front = -1;
		arr = new Customer[size];
	}

	public boolean isEmpty() {
		if (front == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (rare == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(Customer data) {
		if (!isFull()) {
			if (front == -1) {
				front = 0;
			}
			rare++;
			arr[rare] = data;
			System.out.println("rare---> " + rare);
			System.out.println("front---> " + front);
		}
		else {
			System.out.println("queue overflow");
		}
	}

	public Customer deQueue() {
		Customer dataCustomer = null;
		if (!isEmpty()) {
			dataCustomer=arr[front];
			if (rare == front) {
				front = rare = -1;
			} else {
				front++;
			}
		}
		System.out.println("rare---> " + rare);
		System.out.println("front---> " + front);
		return dataCustomer;
	}
	public void display() {
		if (isEmpty()) {
			System.out.println("***** Queue is Empty *********");
		} else {
                    for(int i=front;i<arr.length;i++)
                    	System.out.println(" "+arr[i]);
		}
	}
}
