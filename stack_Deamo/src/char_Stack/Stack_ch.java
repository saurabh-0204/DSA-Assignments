package char_Stack;

public class Stack_ch {
	private int top = -1;
	private int size;
	private char arr[];
	public Stack_ch() {
		size = 3;
		arr = new char[size];
	}

	public Stack_ch(int size) {

		this.size = size;
		arr = new char[size];
	}

	public boolean isEmpty() {
		if (top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isFull() {
		if (top==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void push(char ch) {
		if (!isFull()) {
			top++;
			arr[top]=ch;
		}
		else {
			System.out.println("Sack is full");
		}
	}
	public Character pop() {
		char ch='\0';
		if (!isEmpty()) {
			ch=arr[top--];
			return ch;
		}
		return ch;
	}
	public  void display() {
		System.out.println("******* Stack is ***********");
		for (int i=top;i>=0;i--)
		{
			System.out.println(" "+arr[i]);
		}
		System.out.println("*************************");
	}
}
