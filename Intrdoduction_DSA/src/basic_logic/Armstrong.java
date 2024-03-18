package basic_logic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number Till Armstrog number will print");
		int no = scanner.nextInt();
		for (int i = 1; i <= no; i++)
			isArmstrong(i);

	}

	public static int power(int base, int index) {
		int res = 1;
		for (int i = 1; i <= index; i++) {
			res *= base;
		}
		return res;

	}

	public static void isArmstrong(int no) {
		int temp = no;
		int sum = 0;
		int index = index(no);
		while (no != 0) {
			int mod = no % 10;
			no = no / 10;
			sum = sum + power(mod, index);
		}
		if (temp == sum) {
			System.out.print(" " + sum);
		}
	}

	public static int index(int no) {
		int cnt = 0;
		while (no != 0) {
			cnt++;
			no /= 10;
		}
		return cnt;
	}
}
