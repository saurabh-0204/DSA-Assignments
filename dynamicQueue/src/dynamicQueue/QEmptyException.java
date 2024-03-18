package dynamicQueue;

public class QEmptyException extends Exception {
	String message;

	public QEmptyException() {
		message = "Queue Is Empty...!";
	}

	public String toString() {
		return message;

	}
}
