package basic_logic;

import java.util.Scanner;

public class Binary_Decimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Binary Number");
		int number = scanner.nextInt();
		int temp = number, cnt = 0, binary = 0;
		while (number != 0) {
			int mod = number % 10;
			number /= 10;
			binary = binary + (int) (mod * Math.pow(2, cnt++));

		}
		System.out.println("Decimal number of " + temp + " is : " + binary);
	}
}
