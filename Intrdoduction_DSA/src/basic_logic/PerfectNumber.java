package basic_logic;

import java.util.Iterator;
import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter number till find Perfect numbers");
		int no = scanner.nextInt();
		for (int i = 1; i <= no; i++) {
			isPerfect(i);
		}

	}

	private static void isPerfect(int no) {
		int temp = 0;
		for (int i = 1; i < no; i++) {
			if (no % i == 0) {
				temp += i;
			}
		}
		if (temp == no) {
			System.out.println(" " + temp);
		}

	}
}
