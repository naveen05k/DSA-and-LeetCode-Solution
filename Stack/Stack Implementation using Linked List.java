package Queue_Implementation;
public class Stack_Using_Linked_list {

	private class Node {
		int data;
		Node link;
	}

	Node top;

	Stack_Using_Linked_list() {
		this.top = null;
	}

	public void push(int x) {

		Node temp = new Node();

		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}

		temp.data = x;
		temp.link = top;
		top = temp;
	}

	// Using this function we will be checking whether the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	// using this function we will return the top element of the stack
	public int peek() {

		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Using this function we will pop the top element of the stack
	public void pop() {

		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		top = (top).link;
	}

	// this function will be used to display the items of the stack
	public void display() {

		if (top == null) {
			System.out.printf("\nStack Underflow");
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.data+"->");
				temp = temp.link;
			}
			System.out.println("End");
		}
	}


	public static void main(String[] args) {

		Stack_Using_Linked_list stack = new Stack_Using_Linked_list();

		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		stack.display();
System.out.println("delete");
		stack.pop();
		stack.pop();

		stack.display();

	}

}
