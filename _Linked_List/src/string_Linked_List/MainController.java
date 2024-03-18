package string_Linked_List;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		S_Linked_List list = new S_Linked_List();
		Scanner scanner = new Scanner(System.in);
		int choice, no;
		String size;
		do {
			System.out.println(
					"Eneter Your Choice \n1.Create Linked list \n2. Add node at End \n3. Display List \n4. addBegining \n5. Modify \n6. Delete Data  \n0. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Size of Your LinkedList ");
				no = scanner.nextInt();
				list.createLinkedList(no);
				break;
			}
			case 2: {
				System.out.println("Enter Data to add ");
				size = scanner.next();
				list.addEnd(size);
				break;
			}
			case 3:
				list.Display();
				break;
			case 4:
				System.out.println("Eneter Data for adding at 1st position");
				size = scanner.next();
				list.addBeg(size);
				break;
			case 5: {
				System.out.println("Enter positon for update");
				int pos = scanner.nextInt();
				System.out.println("Eneter name to update");
				String name = scanner.next();
				list.modify(pos, name);
				break;
			}
			case 6: {
				System.out.println("Eneter name to delete");
				String name = scanner.next();
				list.delete(name);
				break;
			}
			}

		} while (choice != 0);
	}
}
