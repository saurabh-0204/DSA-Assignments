package doublyLinkedList;

public class Node {
	private int data;
	 private Node previuos, next;

	public Node(int data) {
		this.data = data;
		previuos = next = null;
	}

	
	public String toString() {
		return  " "+data + "";
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPreviuos() {
		return previuos;
	}


	public void setPreviuos(Node previuos) {
		this.previuos = previuos;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}


	public int getData() {
		return data;
	}
   
}
