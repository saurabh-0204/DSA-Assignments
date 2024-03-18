package int_Linked_List;

import java.util.Scanner;

public class Linked_List {
	Node head;
	Scanner scanner = new Scanner(System.in);

	public Linked_List() {
		head = null;
	}

	public Linked_List(int size) {

		head = null;
	}

	public void createLinkedList(int size) {

		for (int i = 0; i <= size; i++) {
			System.out.println("Enter Number");
			int no = scanner.nextInt();
			addNode(no);

		}
	}

	public void addNode(int no) {
		Node record = new Node(no);
		if (head == null) {
			head = record;
		} else {
			Node move;
			for (move = head; move.getLink() != null; move = move.getLink())
				;
			move.setLink(record);
		}
	}

	public void Display() {

		Node move;
		for (move = head; move.getLink() != null; move = move.getLink()) {
			System.out.print(move.getData() + " ");
		}
		if (move.getLink() == null) {
			System.out.println(move.getData() + " ");
		}
	}

	public void sortedLinkedList() {
		Node tag, temp = head;
		while (temp != null) {
			tag = temp.getLink();
			while (tag != null) {
				if (temp.getData() > tag.getData()) {
					int sort = temp.getData();
					temp.setData(tag.getData());
					tag.setData(sort);
				}
				tag = tag.getLink();
			}
			temp = temp.getLink();
		}
	}

	public void reverse(Node move) {
		if (move != null) {
			reverse(move.getLink());
			System.out.print(move.getData() + " ");
		}

	}

	public void delete(int num) {
		Node del, move = head;
		Boolean flag = false;
		if (head.getData() == num) {
			head = head.getLink();
		} else {
			while (move.getLink() != null) {
				if (move.getLink().getData() == num) {
					del = move.getLink();
					move.setLink(del.getLink());
					del = null;
					flag = true;
					break;
				}
				move = move.getLink();

			}

		}
		if (flag == false) {
			System.out.println("Number Not Present");
		}
	}

	public void split() {
		Linked_List l1 = new Linked_List();
		Linked_List l2 = new Linked_List();
		Node move = head;
		while (move != null) {
			if (move.getData() % 2 == 0) {
				l1.addNode(move.getData());
			} else {
				l2.addNode(move.getData());
			}
			move = move.getLink();
		}
		System.out.println("****Even Linked List****");
		l1.Display();
		System.out.println("*****Odd  Linked List****");
		l2.Display();
	}
}
