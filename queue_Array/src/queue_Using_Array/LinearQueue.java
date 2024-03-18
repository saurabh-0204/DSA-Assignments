package queue_Using_Array;

import java.util.Scanner;

public class LinearQueue {
	public static void main(String[] args) {
		IntQueue iQueue = new IntQueue(10);
		Scanner scanner = new Scanner(System.in);
		int choice, data;
		do {
			System.out
					.println(" \t Enter Your Choice \n1 . Enqueue \n2 . DeQueue " + "\n3 . Display Queue \n4. Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Ensert Data");
				data = scanner.nextInt();
				iQueue.enQueue(data);
				break;
			}
			case 2:
				data = iQueue.deQueue();
				if (data == -9999) {
					System.out.println("Stack is Empty");
				} else {
					System.out.println(data);
				}
				break;
			case 3:
				System.out.println("***********************");
				iQueue.displayLinear();
				System.out.println("***********************");

			}
		} while (choice != 4);
	}
}
