package basic_logic;

//OP=[1,2,3,4,5,11,22,33,44,55];
public class Merge2Array {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 22, 33, 44, 55 };
		int c[] = new int[arr1.length + arr2.length];
		for (int i = 0, j = 0; i < arr1.length; i++,j++) {
			c[i] = arr1[i];
			c[i + 5] = arr2[j];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}
}
