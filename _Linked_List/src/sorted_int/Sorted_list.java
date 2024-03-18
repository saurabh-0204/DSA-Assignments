package sorted_int;

import java.util.Scanner;

public class Sorted_list {
public static void main(String[] args) {
	Linked_sort list=new Linked_sort();
	Scanner scanner = new Scanner(System.in);
	int choice, size;
	do {
		
		System.out.println("Eneter Your Choice \n1.Create Linked list \n2. Add Data \n3. Display List \n4. Exit");
		choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter Size of Your LinkedList ");
			size = scanner.nextInt();
			list.createSortLinkedList(size);
			break;
		}
		
		case 3:
			list.Display();
		}
	} while (choice != 4);
}
}

