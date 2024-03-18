package string_Linked_List;

public class Node {
	 String data;
	Node link;

	public Node(String data) {
		super();
		this.data = data;
		link = null;
	}

	public Node() {
		link = null;
		data = null;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}

	public String toString() {
		return data + " ";
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return this.data;
	}
}
