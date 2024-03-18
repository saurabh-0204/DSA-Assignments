package selectionSort;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ENter Element");
			arr[i] = sc.nextInt();
		}

		System.out.println("\n<......Array Before Soorting......>");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		for (int i = 0; i < size; i++) {
			int sum = arr[i];
			int index = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < sum) {
					sum = arr[j];
					index = j;
				}
			}
			arr[index] = arr[i];
			arr[i] = sum;

		}
		System.out.println("\n<......Array After Soorting......>");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
