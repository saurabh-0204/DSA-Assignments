package doubleEndedQueue;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {

		int data;
		int ch;
		Queue q1 = new Queue();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" Enter Your choice ");
			System.out
		.println("\n1. Add Front \n2. Add rear \n3. delete Front \n4. delete rear \n5. DisplayF \n0. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(" Enter Data to insert ");
				data = sc.nextInt();
				q1.enQueFront(data);
				break;
			case 2:
				System.out.println(" Enter Data to insert ");
				data = sc.nextInt();
				q1.enQueueRear(data);
				break;
			case 3:
				try {
					data = q1.deQueueFront();
					System.out.println(" Delete Data " + data);
				} catch (Queue_Empty_Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					data = q1.deQueueRear();
					System.out.println(" Delete Data " + data);
				} catch (Queue_Empty_Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				q1.display();
				System.out.println();

			}
		} while (ch != 0);
	}
}
