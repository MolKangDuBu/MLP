package com.woori.util;

import java.util.Scanner;

public class Bank {
	int number= 1;
	MyQueue q = new MyQueue();
	Scanner sc = new Scanner(System.in);
	
	
	public void start() {
		while(true) {
			System.out.println("1. �մ�");
			System.out.println("2. �����");
			System.out.println("3. ����");
			System.out.print("���� : ");
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
		System.out.println("�մ��� ��ȣ�� "+number+"�̰�,"
				+ " ���� ����ڰ� "+q.getCount()+"�� �ְ�,"
						+ " ��⿹��ð���"+q.getCount()*2+"�Դϴ�.");
		number++;
	}
	
	public void callClerk() {
		int temp =0;
		if(q.isEmpty())System.out.println("��� ���� �մ��� �����ϴ�.");
		else {
			temp = q.get();
			System.out.println(temp+"�� �մ� â�������� ���ּ���\n");
		}
		
		
	}
	
}
