package day2_array;

import java.util.Scanner;

public class Transpose_2D_Array {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr Row of matrix ");
		int row = scanner.nextInt();

		System.out.println("Enetr column of matrix ");
		int column = scanner.nextInt();
		int arr[][] = new int[row][column];
		int transpose[][] = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter Element in row  ");
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("**************Original Array************");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		System.out.println("**************Transpose Array************");
		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose.length; j++) {
				System.out.print(" " + transpose[i][j]);
			}
			System.out.println();
		}
	}
}
