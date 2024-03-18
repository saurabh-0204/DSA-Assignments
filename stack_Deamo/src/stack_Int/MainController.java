package stack_Int;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		StackInt s1 = new StackInt(5);
		int ch, data;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\t Enter Your choice  \n 1.  Push  \n 2. Pop \n 3. Peek \n 4. Display \n 6. Exit");

			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(" Enter Data To Insert ");
				data = sc.nextInt();
				s1.push(data);
				break;
			case 2:
				data = s1.pop();
				if (data == -9999)
					System.out.println("Stack Is empty ");
				else
					System.out.println("Deleted Ele Is " + data);
				break;
			case 3:
				data = s1.peek();
				if (data == -9999)
					System.out.println("Stack Is empty ");
				else
					System.out.println("Top element  " + data);
				break;

			case 4:
				s1.display();
				break;

			}
		} while (ch != 6);
	}

}
