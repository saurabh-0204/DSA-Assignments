package doubleEndedQueue;

public class Queue_Empty_Exception extends RuntimeException {
	String msg;

	public Queue_Empty_Exception() {
		msg = "Queue is Empty";
	}
	@Override
	public String getMessage()
	{
		return msg;
	}
}
