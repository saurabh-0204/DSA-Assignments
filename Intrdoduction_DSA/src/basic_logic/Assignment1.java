package basic_logic;

import java.util.Scanner;

//1st 100 Prime Numbers
//print between given range
//print fisrt 10
public class Assignment1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int no1 = scanner.nextInt();
		System.out.println("Enter 2nd number");
		int no2 = scanner.nextInt();
		int cnt = 0;

		for (int i = no1; i <= no2; i++) {
			int prime = isPrime(i);

			if (prime == 0) {

			} else {
				cnt++;
				if(cnt<=10) {
				System.out.print(" " + prime);
				}
			}

		}
	}

	public static int isPrime(int no) {
		int count = 0;
		int res = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				count++;
			}
		}
		if (count == 2)
			res = no;
		return res;
	}

}
