package 순차검색;

public class Stack<T> {//후입선출
	T stack[];
	int top;
	
	
	public Stack() {
		stack = (T[])new Object[10];
		top=-1;
	}
	
	public Stack(int size) {
		if(size<10) {
			size= 10;
			stack = (T[])new Object[size];
			top=-1;
		}
	}
	
	public void push(T a) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		stack[top]= a;
	}
	
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		}
		T temp = stack[top];
		top--;
		return temp;
	}
	
	public T peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow");
			return null;
		}
		T temp = stack[top];//최상위데이터 확인
		return temp;
	}
	
	boolean isFull() {
		if(top==stack.length)
			return true;
		else
			return false;
	}
	
	boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}
	

	
	public void init() {
		top =-1;
	}
}
