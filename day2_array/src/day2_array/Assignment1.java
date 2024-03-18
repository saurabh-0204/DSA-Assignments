package day2_array;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		int arr1[] = { 2, 5, 7, 6 };
		int arr2[] = { 12, 9, 11, 7, 5, 2 };
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1. Display Array \n2. Union of two Arrays \n3. Intersection of Two Arrays"
					+ " \n4. count of all Even Number from array  \n5. count of all Even Number from array \n6. Exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println(" ******** First  Array  ***********");
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(" " + arr1[i]);
				}
				System.out.println();
				System.out.println(" ******** Second  Array  ***********");
				for (int i = 0; i < arr2.length; i++) {
					System.out.print(" " + arr2[i]);
				}
				System.out.println();

				break;
			}
			
			case  2:
				System.out.println("Union of two Arrays");
				break;
			}

		} while (choice != 6);
		System.out.println("........Exited.......");
	}
}
