package doublyLinkedList;

import java.util.Scanner;

public class DoublyLink {
	Node head;
	Scanner scanner = new Scanner(System.in);

	public DoublyLink() {
		head = null;
	}

	public void createDoubly(int data) {
		for (int i = 0; i < data; i++) {
			System.out.println("Add Data");
			int num = scanner.nextInt();
			addNode(num);
		}
	}

	private void addNode(int num) {
		Node n1 = new Node(num);
		if (head == null) {
			head = n1;
		} else {
			Node move = head;
			while (move.getNext() != null) {
				move = move.getNext();
			}
			move.setNext(n1);
			n1.setPreviuos(move);
		}
	}

	public void deleteByData(int data) {
		boolean flag = false;
		if (head.getData() == data) {
			if (head.getNext() == null) {
				head = null;
				flag = true;
				return;
			} else {
				head.getNext().setPreviuos(null);
				head = head.getNext();
				flag = true;
				return;
			}
		} else {
			Node del, move = head;
			while (move.getNext().getData() != data) {
				move = move.getNext();
			}
			del = move.getNext();
			if (del.getNext() != null) {
				del.getNext().setPreviuos(move);
			}
			move.setNext(del.getNext());
			del = null;
			flag = true;

		}
		if (flag == false) {
			System.out.println("Enter Valid Position");
		}
	}

	public void deleteByPos(int pos) {
		boolean flag = false;
		if (pos == 1) {
			if (head.getNext() == null) {
				head = null;
				flag = true;
			} else {
				head.getNext().setPreviuos(null);
				head = head.getNext();
				flag = true;

			}
		} else {
			Node del, move = head;
			for (int i = 1; i < pos - 1; i++)
				move = move.getNext();
			del = move.getNext();
			if (del.getNext() != null) {
				del.getNext().setPreviuos(move);
			} else {
				move.setNext(del.getNext());
				del = null;
			}
			flag = true;
		}
		if (flag == false) {
			System.out.println("Invalid position ");
		}

	}

	public void insertPos(int pos, int data) {
		if (pos <= 0 || pos > size()) {
			System.out.println("Enter Valid Position");
			return;
		}
		Node n1 = new Node(data);
		if (pos == 1) {
			if (head == null) {
				head = n1;
			} else {
				n1.setNext(head);
				head.setPreviuos(n1);
				head = n1;
			}
		}
		else {
			Node move=head;
			for(int i=1;i<pos-1;i++)
				move=move.getNext();
			n1.setNext(move.getNext());
			if (n1.getNext()!=null) {
				move.getNext().setPreviuos(n1);
			}
			move.setNext(n1);
			n1.setPreviuos(move);
		}
	}

	public void display() {
		Node move;
		for (move = head; move.getNext() != null; move = move.getNext()) {
			System.out.print(" " + move.getData());
		}
		if (move.getNext() == null) {
			System.out.print(" " + move.getData());
			System.out.println();

		}

	}

	public int size() {
		Node move = head;
		int cnt = 0;
		while (move != null) {
			cnt++;
			move=move.getNext();		}
		return cnt;
	}

}
