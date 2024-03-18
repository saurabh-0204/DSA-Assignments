package int_Linked_List;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {

		Linked_List list = new Linked_List();
		Scanner scanner = new Scanner(System.in);
		int choice, size;
		do {
			System.out.println(
					"Eneter Your Choice \n1.Create Linked list \n2. Add Data \n3. Sort LL \n4. Display List \n5. Delete Data \n6. Split Linked List \n7. Reverse Print LL \n0. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Size of Your LinkedList ");
				size = scanner.nextInt();
				list.createLinkedList(size);
				break;
			}
			case 2: {
				System.out.println("Enter Data to add ");
				size = scanner.nextInt();
				list.addNode(size);
				break;
			}
			case 3:
				list.sortedLinkedList();
				System.out.println("***Sorted List****");
				list.Display();
				break;
			case 4:
				System.out.println("****Linked List*******");
				list.Display();
				break;
			case 5:
				System.out.println("Enter Number for Delete");
				int num = scanner.nextInt();
				list.delete(num);
				break;
			case 6:
				System.out.println("Splited Linked List are");
				list.split();
				break;
			case 7:
				System.out.println("** Reverse Linked List *****");
				list.reverse(list.head);
			}

		} while (choice != 0);
	}
}
