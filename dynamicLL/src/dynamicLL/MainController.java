package dynamicLL;

import java.security.PublicKey;
import java.util.Scanner;

public class MainController {
	public static void main(String[] args) throws StackEmptyException {
		DynamicStack d=new DynamicStack();
		Scanner scanner = new Scanner(System.in);
		int choice, size;
		do {
			System.out.println("Eneter Your Choice \n1. Push \n2. Pop \n3. Display List \n0. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Data ");
				size = scanner.nextInt();
				d.push(size);
				break;
			}
			case 2: {
				int data=d.pop();
				System.out.println(" Deleted Data is :"+data);
				break;
			}
			case 3:
				System.out.println();
				d.display();
				System.out.println();
			}
		} while (choice != 4);
	}
}
