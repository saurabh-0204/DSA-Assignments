package simple_BinaryTree;

import java.util.Scanner;

public class BinaryTree {
	Node root;
	Scanner scanner = new Scanner(System.in);

	public BinaryTree() {
		root = null;
	}

	public void addNode(int data) {
		Node n1 = new Node(data);
		if (root == null) {
			root = n1;
			System.out.println("Root Created " + root);
			return;
		}
		Node move = root;
		while (true) {
			System.out.println("Where To attache "+n1+" for Node "+move.getData());
			System.out.println("Enter choice for element add  \n\t1. Left  \t0. Right");
			int choice = scanner.nextInt();
			if (choice == 1) {
				if (move.getLeft() == null) {
					move.setLeft(n1);
					System.out.println("Node"+n1+" Added at Left of " + move.getData()+".");
					break;
				} else {
					move = move.getLeft();
				}
			} else if (choice == 0) {
				if (move.getRight() == null) {
					move.setRight(n1);
					System.out.println("Node"+n1+" Added at Right of " + move.getData()+".");
					break;
				} else {
					move = move.getRight();
				}
			} else {
				System.out.println("Enter Correct Choice BetWeen Options");
			}
		}
	}

	public void displayTree() {
		System.out.println();
		System.out.println("****** In-Order Display ***********");
		inOrder(root);
		System.out.println();
		System.out.println("******  Pre-Order Display **********");
		preOrder(root);
		System.out.println();
		System.out.println("****** Post-Order Display ********");
		postOrder(root);

	}

	private void postOrder(Node move) {
		if (move != null) {
			postOrder(move.getLeft());
			postOrder(move.getRight());
			System.out.print(move.getData()+"  ");
		}
	}

	private void preOrder(Node move) {
		if (move != null) {
			System.out.print(move.getData()+"  ");
			preOrder(move.getLeft());
			preOrder(move.getRight());
		}
	}

	private void inOrder(Node move) {
		if (move != null) {
			inOrder(move.getLeft());
			System.out.print(move.getData()+"  ");
			inOrder(move.getRight());
		}
	}
}
