package char_Stack;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		Stack_ch s = new Stack_ch();
		int choice;
		char data;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter your choice  \n 1.  Push  \n 2. Pop \n 3. Display \n 4. Exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Data to Insert");
				data = scanner.next().charAt(0);
				s.push(data);
				break;
			case 2:
			data=s.pop();
				if (data=='\0')
					System.out.println("Stack Is empty ");
				else
					System.out.println("Deleted Ele Is " + data);
				break;
			case 3:
				s.display();

			}
		} while (choice != 4);
	}
}
