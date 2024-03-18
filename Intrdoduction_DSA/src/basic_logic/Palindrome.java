package basic_logic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number Till Palindrome number will print");
		int no = scanner.nextInt();
		System.out.println("Palindrome numbers in given range is");
		for (int i = 0; i <= no; i++) {
			if (isPalindrome(i) != 0) {
				System.out.println(isPalindrome(i) + " ");
			}
		}
	}

	public static int isPalindrome(int no) {
		int reverse = 0, rem;
		int number = no;

		while (no != 0) {
			rem = no % 10;
			reverse = reverse * 10 + rem;
			no = no / 10;
		}
		if (reverse == number) {
			return reverse;
		} else {
			return 0;
		}

	}
}
