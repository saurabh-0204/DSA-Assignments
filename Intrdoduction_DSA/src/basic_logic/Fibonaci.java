package basic_logic;

import java.util.Scanner;

//print fibo series given range
public class Fibonaci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number till Fibo series print");
		int number = scanner.nextInt();
		isFibonaci(number);
	}
	private static void isFibonaci(int number) {
		long a = 0, b = 1, c;
		for (int i = 0; i <= number; i++) {
			System.out.println(" " + a);
			c = a + b;
			a = b;
			b= c;
		}
	}
}
