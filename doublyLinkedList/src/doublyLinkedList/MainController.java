package doublyLinkedList;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		DoublyLink d = new DoublyLink();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println(
					"Enter Your Choice \t\n1. AddNode \n4. Insert at Position \n5. Delete By Data \n6. Delete By Pos \n7. Display");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Size for Doubly LL");
				int size = scanner.nextInt();
				d.createDoubly(size);
				break;
			}
			case 4: {
				System.out.println("Enter pos");
				int pos = scanner.nextInt();
				System.out.println("Enter Data ");
				int data = scanner.nextInt();
				d.insertPos(pos, data);
				break;
			}
			case 5: {
				System.out.println("Eneter Data for Delete");
				int del = scanner.nextInt();
				d.deleteByData(del);
				break;
			}
			case 6: {
				System.out.println("Eneter Postion for Delete");
				int del = scanner.nextInt();
				d.deleteByPos(del);
				break;
			}
			case 7:
				System.out.println("***Doubly Linked List****");
				d.display();
				break;
			}

		} while (choice != 0);
	}
}
