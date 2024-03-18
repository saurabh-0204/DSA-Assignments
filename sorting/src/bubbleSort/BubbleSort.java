package bubbleSort;

import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int a[]) {
		int i, j, temp;
		int size = a.length;
		for (i = 0; i < size - 1; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void accept(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter " + a.length + " Elements ");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
	}

	public static void display(int a[]) {
		System.out.println("--------- Array is ---------\n");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
	}

	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Size For Array ");
		no = sc.nextInt();
		int arr[] = new int[no];
		accept(arr);
		display(arr);
		bubbleSort(arr);
		display(arr);
		sc.close();
	}
}
