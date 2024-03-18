package binary_Search_Tree;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		BinarySearchTree b1 = new BinarySearchTree();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter choise...");
			System.out.println("1.addNode");
			System.out.println("2.display");
			System.out.println("3.height");
			System.out.println("4.search");
			System.out.println("5.Delete");
			System.out.println("0.exit");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.println("Enter data to add...");
				b1.addNode(sc.nextInt());
				break;

			case 2:
				b1.display();
				break;

			case 3:
				System.out.println("Height is : " + b1.height(b1.root));
				break;

			case 4:
				System.out.println("Enter data to search...");
				int data = sc.nextInt();

				if (b1.searchData(data)) {
					System.out.println("present");
				} else {
					System.out.println("not present");
				}
				break;
			case 5:
				System.out.println("Enter Data for Delete :");
				int num = sc.nextInt();
				b1.delete(num);
			}

		} while (ch != 0);

	}

}
