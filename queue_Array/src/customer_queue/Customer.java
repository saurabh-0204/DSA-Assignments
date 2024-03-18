package customer_queue;

public class Customer {
	private int id;
	private String name;

	public String toString() {
		return  "[  " + id + " , " + name + " ]";

	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {

	}

}
