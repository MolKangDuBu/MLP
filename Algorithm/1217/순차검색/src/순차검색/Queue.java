package 순차검색;

public class Queue<T> {//FIFO 선입선출
	int front;
	int rear;
	int size;
	T[] queue;
	
	
	public Queue() {
		rear=0;
		front=0;
		size = 11;
		queue = (T[])new Object[size];
	}
	
	public Queue(int size) {
		this.size = size+1;
		if(size<10) {
			size= 10;
			queue = (T[])new Object[size];
			rear=0;
			front=0;
		}
	}
	
	
	public void put(T a) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}
		if(rear ==size)rear%=size;
		queue[rear] = a;
		rear++;
		
	}
	
	public T get() {
		if(isEmpty()) {
			System.out.println("Empty");
			return null;
		}
		T temp =queue[front];
		front++;
		return temp;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Empty");
			return null;
		}
		T temp =queue[rear];
		return temp;
	}
	
	
	public void display() {
		int i = front;
		while(i!=rear){
			
			System.out.print(queue[i]+ " ");
			i = (i+1)%size;
		}
		System.out.println();
	}
	
	public boolean isFull() {
		if((rear+1)%size==front) {
			
			return true;
		}else {
			
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(rear ==front) {
			return true;
		}else return false;
	}
	
	
}
