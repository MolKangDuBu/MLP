package com.woori.util;

public class MyQueue {

	Node head;
	Node tail;
	
	public MyQueue() {
		init();
	}
	
	
	public void init() {
		head = new Node();
		tail = new Node();
		head.prev = head;
		head.next = tail;
		tail.prev = head;
		tail.next = tail;
	}
	
	
	public void put(int data) {
		Node temp = new Node();
		temp.data = data;
		
		temp.prev = tail.prev;
		tail.prev = temp;
		
		temp.prev.next = temp;
		temp.next = tail;
			
	}
	
	public int get() {
		int data = 0;
		if(head.next ==tail)return data;
		
		data = head.next.data;
		Node del = head.next;
		head.next = del.next;
		head.next.prev = head; 
		return data;
	}
	
	
	
	
	
	public void display() {
		Node trace = head.next;
		while(trace!=tail) {
			System.out.print(trace.data);
			trace = trace.next;
		}
	}
	
	
	
	public void reversedisplay() {
		Node trace = tail.prev;
		while(trace!=head) {
			System.out.print(trace.data);
			trace = trace.prev;
		}
	}
	
	public int getCount() {
		int count =0;
		if(head.next ==tail)return count;
		Node temp= head.next;
		while(temp!=tail) {
			count++;
			temp =temp.next;
		}
		return count;
	}
	
	
	public boolean isEmpty() {
		if(head .next==tail)return true;
		else return false;
	}
	
	
	public int peek() {
		if(isEmpty())return -1;
		return tail.prev.data;
	}
}
