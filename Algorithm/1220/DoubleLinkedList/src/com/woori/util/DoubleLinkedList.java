package com.woori.util;

public class DoubleLinkedList {

	Node head;
	Node tail;
	
	public DoubleLinkedList() {
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
	
	
	public void insertTail(String data) {
		Node temp = new Node();
		temp.data = data;
		
		temp.prev = tail.prev;
		tail.prev = temp;
		
		temp.prev.next = temp;
		temp.next = tail;
			
	}
	
	public String deleteHead() {
		String data = "";
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
}
