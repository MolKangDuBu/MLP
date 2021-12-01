package com.woori.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer>person = new ArrayList<Integer>();
	
	int computer;
	boolean match = false;
	int count = 0;
	
	
	
	public NumberGame() {
		super();
		Random rand = new Random();
		computer = rand.nextInt(10)+1;
	}
	
	
	
	public void start() {
		
		
		
		while(!match && count<5) {
			System.out.print("���� : ");
			int temp = sc.nextInt();
			person.add(temp);
			
			if(temp==computer) {
				match = true;
			}else if(temp>computer) {
				System.out.println("���ڰ� Ů�ϴ�.");
			}else {
				System.out.println("���ڰ� �۽��ϴ�.");
			}
			count++;
		}
		
		if(match) {
			System.out.printf("%d ���� ������ϴ�.\n", count);
		}else {
			System.out.println("�Է� ȸ���� �ʰ������ϴ�.");
		}
		
	}



	public ArrayList<Integer> getPerson() {
		return person;
	}



	public void setPerson(ArrayList<Integer> person) {
		this.person = person;
	}



	public int getComputer() {
		return computer;
	}



	public void setComputer(int computer) {
		this.computer = computer;
	}



	public boolean isMatch() {
		return match;
	}



	public void setMatch(boolean match) {
		this.match = match;
	}



	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
