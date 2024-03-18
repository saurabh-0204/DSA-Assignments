package binary_Search_Tree;

public class Node {
	 int data;
	 Node right, left;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public Node getRight() {
		return right;
	}

	public Node getLeft() {
		return left;
	}

	@Override
	public String toString() {
		return  data + " ";
	}
	
}
