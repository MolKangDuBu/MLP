package com.woori.util;

import java.util.Scanner;

public class Bank {
	int number= 1;
	MyQueue q = new MyQueue();
	Scanner sc = new Scanner(System.in);
	
	
	public void start() {
		while(true) {
			System.out.println("1. 손님");
			System.out.println("2. 은행원");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				callCustomer();
				break;
			case 2:
				callClerk();
				break;
			case 3:
				return;
			}
			
		}
	}
	
	public void callCustomer() {
		
		q.put(number);
		System.out.println("손님의 번호는 "+number+"이고,"
				+ " 현재 대기자가 "+q.getCount()+"명 있고,"
						+ " 대기예상시간은"+q.getCount()*2+"입니다.");
		number++;
	}
	
	public void callClerk() {
		int temp =0;
		if(q.isEmpty())System.out.println("대기 중인 손님이 없습니다.");
		else {
			temp = q.get();
			System.out.println(temp+"번 손님 창구앞으로 와주세요\n");
		}
		
		
	}
	
}
