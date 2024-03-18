package insertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Size of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ENter Element");
			arr[i] = sc.nextInt();
		}

		System.out.println("\n<......Array Before Sorting......>");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];
			while (j >= 0 && arr[j] >= key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}

		System.out.println("\n*********After Sortings****\n");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
