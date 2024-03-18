package string_Linked_List;

import java.util.Scanner;

public class S_Linked_List {
	Node head;
	int size;
	Scanner scanner = new Scanner(System.in);

	public S_Linked_List() {
		head = null;
	}

	public void createLinkedList(int size1) {
		String data;
		size = size1;
		for (int i = 0; i < size1; i++) {
			System.out.println("Enter String");
			data = scanner.next();
			addEnd(data);
		}
	}

	public void addEnd(String data) {
		Node record = new Node(data);
		if (head == null) {
			head = record;
		} else {
			Node Move;
			for (Move = head; Move.getLink() != null; Move = Move.getLink()) {
			}
			Move.setLink(record);
		}
	}

	public void Display() {
		Node move;
		System.out.println("******Linked List******");
		for (move = head; move.getLink() != null; move = move.getLink()) {
			System.out.println(move.getData() + " ");
		}
		if (move.getLink() == null) {
			System.out.println(move.getData() + " ");
		}
	}

	public void addBeg(String data) {
		Node record = new Node(data);
		if (head == null) {
			head = record;
		} else {
			record.link = head;
			head = record;
		}
	}

	public void modify(int pos, String name) {
		if (pos <= 0 || pos > size) {
			System.out.println("Not Present position");
		} else {
			Node move = head;
			for (int i = 1; i < pos; i++) {
				move = move.getLink();
			}
			move.setData(name);
		}
	}

	public void delete(String name) {
		Node del;
		boolean flag = false;

		if (head.data.equals(name) ) {
			del = head;
			head = head.link;
			del = null;
			flag = true;
		} else {
			Node move = head;
			while (move.link != null) {
				if (move.link.data.equals(name)) {
					del = move.link;
					move.link = del.link;
					del = null;
					flag = true;
					break;
				}
				move = move.link;
			}
		}
		if (flag == false) {
			System.out.println("Not Presnt");
		}
	}
}
