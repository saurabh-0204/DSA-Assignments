package customer_queue;

import java.util.Scanner;

public class CustomerController {

	public static void main(String[] args) {
		int choice, id;
		Customer data = null;
		String name;
		Customer_Queue cq = new Customer_Queue(3);
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println(" \t Enter Your Choice \n1 . Enqueue \n2 . DeQueue " + "\n3 . Display Queue \n4. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Customer id and Name");
				id = scanner.nextInt();
				name = scanner.next();
				data = new Customer(id, name);
				cq.enQueue(data);
				break;
			case 2:
				data = cq.deQueue();
				if (data == null) {
					System.out.println(" Queue is Empty");
				} else {
					System.out.println(data);
				}
				break;
			case 3:
				cq.display();
				System.out.println();
				
			}

		} while (choice != 4);
	}

}

