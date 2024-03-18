package stack_Int;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		StackInt s = new StackInt();
		Scanner scanner = new Scanner(System.in);
		int choice, data;
		do {
			System.out.println("Enter your choice  \n 1.  Push  \n 2. Pop \n 3. Display \n 4. Exit");
			choice = scanner.nextInt();
			int count = 0;
			switch (choice) {
			case 1: {
				do {
					if (count == 10) {
						System.out.println("Stack is full.");
						break;
					}
					System.out.println("Enter Number for Prime stack ");
					int num = scanner.nextInt();
					if (isPrime(num) > 0) {
						count++;
						s.push(num);
					}

				} while (count < 11);
				break;
			}
			case 2: {
				data = s.pop();
				if (data == -9999)
					System.out.println("Stack is empty ");
				else
					System.out.println("Deleted number Is " + data);
				break;
			}
			case 3: {
				s.display();
				break;
			}

			}
		} while (choice != 4);
	}
	public static int isPrime(int no) {
		int count = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return no;
		}
		return 0;
	}
}
