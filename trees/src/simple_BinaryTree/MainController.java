package simple_BinaryTree;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter choice \t \n1. Add Node \n2. Display Node \n0. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Eneter Data ");
				int data = scanner.nextInt();
				binaryTree.addNode(data);
				break;
			}
			case 2:
				System.out.println("**************************************************");
				binaryTree.displayTree();
				System.out.println();
				break;

			default:
				System.out.println("Enter Valid Choice");
				break;
			}
		} while (choice != 0);
	}
}
