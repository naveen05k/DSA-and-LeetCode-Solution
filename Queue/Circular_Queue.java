package Queue_Implementation;

public class Circular_Queue {
	protected int[] data;
	private static final int DEFAULT_SIZE = 10;
	protected int front = 0;
	protected int end = 0;
	protected int size = 0;

	public Circular_Queue() {
		this(DEFAULT_SIZE);
	}

	public Circular_Queue(int size) {
		this.data = new int[size];
	}

	public boolean isFull() {
		return size == data.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean insert(int item) {
		if (isFull()) {
			return false;
		}
		data[end++] = item;
		end = end % data.length;
		size++;
		return true;
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int del = data[front++];
		front = front % data.length;
		size--;
		return del;
	}

	public int front() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is empty");
		}
		return data[front];
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Empty");
		}
		int i = front;
		do {
			System.out.print(data[i] + "->");
			i++;
			i = i % data.length;
		} while (i != end);
		System.out.println("END");
	}

	public static void main(String[] args) throws Exception {
		Circular_Queue queue = new Circular_Queue();
		queue.insert(1);
		queue.insert(3);
		queue.insert(4);
		queue.display();
		// queue.remove();
		// queue.display();
	}
}
