package com.woori.myapp;

public class MyList<T> {
	Node<T> head =null;
	Node<T> tail= null;
	
	
	public MyList() {
		init();
	}
	
	public void init() {
		head = new Node<T>();
		tail = new Node<T>();
		
		head.next = tail;
		tail.next = tail;
		
	}
	
	public void insertHead(T data) {
		
		//항상 head쪽에 데이터를 넣는다
		Node<T> temp = new Node<T>();
		temp.data = data;
		temp.next = head.next;
		head.next = temp;
	}
	
	
	
	public void insertTail(T data) {
		Node temp = new Node();
		temp.data =data;
		Node trace2 = head;
		Node trace1 = head.next;
		
		while(trace1!=tail) {
			trace1 = trace1.next;
			trace2 = trace2.next;
		}
		trace2.next = temp;
		temp.next =tail;
		
		
	}
	
	
	public Node<T> find(T data) {
		
		Node trace;
		trace = head.next;
		
		while(trace != tail) {
			if(data.equals(trace.data)) {
				return trace;
			}
			trace = trace.next;
		}
		return null;		
		
	}
	
//	public void orderedInsert(T data) {
//		Node<T> temp = new Node<T>();
//		temp.data = data;
//		
//		Node<T> trace2 = head;
//		Node<T> trace1 = head.next;
//		
//		while(trace1!= tail&&trace1.data.compareTo(data)<=0) {
//			trace2 = trace2.next;
//			trace1 = trace1.next;
//		}
//		
//		temp.next = trace1;
//		trace2.next = temp;
//		
//	}
//	
	
	public void deleteHead() {
		if(head.next == tail) {
			return;
		}
		head.next = head.next.next;	
	}
	
	public void deleteAll() {
		head.next = tail;
	}
	
	public void deleteTail() {
		if(head.next == tail)
			return;
		Node trace =head.next;
		while(trace.next.next!= tail) {
			trace = trace.next;
		}
		trace.next = tail;
		
	}
	
	 public void deleteItem(String data)
	   {
	      if( head.next == tail)
	         return;
	      
	      Node trace2 = head;
	      Node trace1 = head.next;
	      boolean flag=false;
	      
	      while(!flag && trace1!=tail)
	      {
	         if (trace1.data.equals(data))
	            flag=true;
	         else
	         {
	            trace1 = trace1.next;
	            trace2 = trace2.next;
	         }
	      }
	      
	      if(flag)
	         trace2.next = trace1.next;
	   }

	
	public void display() {
		Node<T> trace;
		trace = head.next;
		while(trace != tail) {
			System.out.print(trace.data +" ");
			trace = trace.next;
		}
		
	
		
	}
}
