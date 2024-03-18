package basic_logic;

import java.util.Scanner;

class Book {
	int bno;
	String name;

	public Book() {

	}

	public Book(int bno, String nm) {
		this.bno = bno;
		this.name = nm;
	}

	public String toString() {
		return bno + "  " + name;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Assignment_9 {

	public static void main(String[] args) {
		Book books[];
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size for Book Array ");
		int no = sc.nextInt();
		books = new Book[no];

		int bno, cnt = 0;
		String name;
		int ch;
		do {
			System.out.println(" Enter Your choice ");
			System.out.println(" 1. Add Recod \n2. Display All Records \n3. Modify \n4. Delete Record \n5. Exit");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println(" Enter Book No ");
				bno = sc.nextInt();
				System.out.println(" Enter Name ");
				name = sc.next();
				books[cnt++] = new Book(bno, name);
				break;
			case 2:
				System.out.println(" Books In Lab");
				for (int i = 0; i < cnt; i++)
					System.out.println(books[i]);
				System.out.println();
				break;
			case 3:
				System.out.println("Enter Book id for Modification");
				int number = sc.nextInt();
				for (int i = 0; i < cnt; i++)
					if (books[i].getBno() == number) {
						System.out.println("Set Book Name");
						String bnString = sc.next();
						books[i].setName(bnString);
						break;
					} else {
						System.out.println("Book with Given ID Not Present");
					}

			case 4:
				System.out.println("Enter Book id for delete");
				int bid = sc.nextInt();
				for (int i = 0; i < cnt; i++)
					if (books[i].getBno() == bid) {
						books[i].setName(books[i + 1].getName());
						books[i].setBno(books[i + 1].getBno());
						cnt--;
						break;
					} else {
						System.out.println("Book with Given ID Not Present");
					}
			case 5:
				System.out.println("Out from Lab");
			}
		} while (ch != 5);

	}

}
