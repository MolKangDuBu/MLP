package com.woori.myapp;

public class UseMyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<String> list = new MyList<String>();
		
		list.insertHead("A");
		list.insertHead("B");
		list.insertHead("C");
		list.insertHead("D");
		list.insertHead("E");
		list.insertHead("F");

//		list.insertTail("A");
//		list.insertTail("B");
//		list.insertTail("C");
//		list.insertTail("D");
//		list.insertTail("E");
//		list.insertTail("F");
		
//		list.orderedInsert("A");
//		list.orderedInsert("D");
//		list.orderedInsert("F");
//		list.orderedInsert("Q");
//		list.orderedInsert("X");
//		list.orderedInsert("B");
//		list.orderedInsert("C");
		
		list.deleteHead();
		list.display();
		
		System.out.println();
		list.deleteTail();
		list.display();
		
		System.out.println();
		list.deleteItem("D");
		list.display();
		
		//System.out.println(list.find("H"));
	}

}
