package Queue_Implementation;

public class Queue_Implementation_using_Array {

	private int[] data;
	private static final int DEFAULT_SIZE = 100;
	int end = 0;

	public Queue_Implementation_using_Array() {
		this(DEFAULT_SIZE);
	}

	public Queue_Implementation_using_Array(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return end == data.length;
	}

	public boolean isEmpty() {
		return end == 0;
	}

	public boolean insert(int item) {
		if (isFull()) {
			return false;
		}
		data[end++] = item;
		return true;
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int del = data[0];
		for (int i = 1; i < end; i++) {
			data[i - 1] = data[i];
		}
		end--;
		return del;
	}

	public int front() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty");
		}
		return data[0];
	}

	public void display() {
		for (int i = 0; i < end; i++) {
			System.out.print(data[i] + "->");
		}
		System.out.println("END");
	}
	

	public static void main(String[] args) throws Exception {
		Queue_Implementation_using_Array queue = new Queue_Implementation_using_Array();
		queue.insert(34);
		queue.insert(44);
		queue.insert(33);
		queue.insert(90);
		queue.display();
		queue.remove();
		queue.display();
	}
}
