package day2_array;

public class SparseMatrix {
	public static void main(String[] args) {
		int arr[][] = { { 0, 0, 1, 0, 3 }, { 0, 4, 0, 0, 0 }, { 0, 0, 0, 0, 9 }, { 19, 0, 0, 0, 0 },
				{ 0, 0, 7, 0, 0 } };
		int nonZero = isNonZero(arr);
		int row = arr.length;
		int col = arr.length;
		System.out.println("***************2D Array********");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(" " + arr[i][j]);
			System.out.println();
		}
		System.out.println("***************Array After Sparse********");
		System.out.println();
		isParse(nonZero, arr, row, col);
	}

	public static int isNonZero(int arr[][]) {
		int ele = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				if (arr[i][j] != 0) {
					ele++;
				}
		}
		return ele;

	}

	public static void isParse(int nonZero, int arr[][], int row, int col) {
		int sparse[][] = new int[nonZero + 1][3];
		sparse[0][0] = row;
		sparse[0][1] = col;
		sparse[0][2] = nonZero;
		int k = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++)
				if (arr[i][j] != 0) {
					sparse[k][0] = i;
					sparse[k][1] = j;
					sparse[k][2] = arr[i][j];
					k++;
				}
		}
		for (int i = 0; i < nonZero + 1; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(" " + sparse[i][j]);
			System.out.println();
		}
	}

}
