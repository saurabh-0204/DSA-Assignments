package sorted_int;

import java.util.Scanner;

public class Linked_sort {
	Node head;
	Scanner scanner = new Scanner(System.in);

	public Linked_sort() {
		head = null;
	}

	public Linked_sort(int size) {
		head = null;
	}

	public void createSortLinkedList(int size) {
		int data;
		for (int i = 0; i < size; i++) {
			System.out.println("Enter No");
			data = scanner.nextInt();
			addNode(data);
		}
	}

	private void addNode(int newData) {
		Node record = new Node(newData);
		if (head==null) {
			head=record;
		} else if(record.data<(head.data=head.data)){
                Node sort;
                for(sort=head;sort.data<record.data;sort=sort.link) {
                	for (sort = head; sort.link != null; sort = sort.link)
        				;
        			sort.link=record;
                }
		}
	}

	public void Display() {
		System.out.println("****Linked List*******");
	Node move;
		for(move=head;move.link!=null;move=move.link)
		{
			System.out.print(move.data+" ");
		}
		if (move.link==null) {
			System.out.println(move.data+" ");
		}
	}
}
