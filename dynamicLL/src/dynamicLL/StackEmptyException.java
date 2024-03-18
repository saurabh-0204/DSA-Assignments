package dynamicLL;

public class StackEmptyException extends Exception {
	String msg;

	public StackEmptyException() {
		msg = "Stack is Empty";
	}

	public StackEmptyException(String str) {
		msg = str;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
