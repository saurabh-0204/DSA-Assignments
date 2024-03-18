package dynamicQueue;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) throws QEmptyException {
		Queue d = new Queue();
		Scanner scanner = new Scanner(System.in);
		int choice, size;
		do {
			System.out.println("Eneter Your Choice \n1. Enqueu \n2. Dequue \n3. Display List \n0. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Data ");
				size = scanner.nextInt();
				d.enQueue(size);
				break;
			}
			case 2: {
				System.out.println("Eneter Data to delelete");
				int data = scanner.nextInt();
				d.deQueue(data);
				System.out.println(" Deleted Data is :" + data);
				break;
			}
			case 3:
				System.out.println();
				
				System.out.println(d+" ");
			}
		} while (choice != 4);
	}
}
