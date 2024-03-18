package int_Linked_List;

public class Node {
	private int data;
	private Node link;

	public Node(int data) {
		this.data = data;
		link = null;
	}

	public Node() {
		link = null;
		data = 0;
	}

	@Override
	public String toString() {
		return data + "  ";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node move) {
		this.link = move;
	}

}
