
package Stack_Implementation;

public class stack_Implementation_Using_Array {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;

	int ptr = -1;

	public stack_Implementation_Using_Array() {
		this(DEFAULT_SIZE);
	}

	public stack_Implementation_Using_Array(int size) {
		this.data = new int[size];
	}

	public boolean push(int item) {
		if (isFull()) {
			System.out.println("Stack is Full!!!");
		}else {
			ptr++;
			data[ptr] = item;
			System.out.println("Push"+item);
			return true;	
		}
		return false;
		
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Can not pop the element");
		}
			int del = data[ptr];
			ptr--;
			return del;
		
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Can not pop the element");
		}
		return ptr = data.length - 1;
	}

	public boolean isFull() {
		return ptr == data.length - 1;
	}

	public boolean isEmpty() {
		return ptr == -1;
	}

	public static void main(String[] args) throws Exception {
		stack_Implementation_Using_Array stack = new stack_Implementation_Using_Array(5);
		 stack.push(34);
	        stack.push(45);
	        stack.push(2);
	        stack.push(9);
	        stack.push(18);
	       // stack.push(89);


	        System.out.println(stack.pop());
	        System.out.println(stack.pop());
	        System.out.println(stack.pop());
	        System.out.println(stack.pop());
	        System.out.println(stack.pop());
	        //System.out.println(stack.pop());

	}

}


