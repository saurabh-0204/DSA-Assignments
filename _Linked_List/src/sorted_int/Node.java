package sorted_int;

public class Node {
	 int data;
	 Node link;

	public Node(int data) {
		this.data = data;
		link = null;
	}

	public Node() {
		link = null;
		data = 0;
	}

	public String toString() {
		return data + "  ";
	}

}
