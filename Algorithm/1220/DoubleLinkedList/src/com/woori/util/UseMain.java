package com.woori.util;

public class UseMain {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.insertTail("A");
		list.insertTail("B");
		list.insertTail("C");
		list.insertTail("D");
		list.insertTail("E");
		list.insertTail("F");
		list.insertTail("G");
		
		list.display();
		System.out.println();
		list.reversedisplay();
		System.out.println();
		list.deleteHead();
		list.display();
		System.out.println();
	}
}
