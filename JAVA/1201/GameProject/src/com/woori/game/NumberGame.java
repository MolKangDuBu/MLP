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
			System.out.print("숫자 : ");
			int temp = sc.nextInt();
			person.add(temp);
			
			if(temp==computer) {
				match = true;
			}else if(temp>computer) {
				System.out.println("숫자가 큽니다.");
			}else {
				System.out.println("숫자가 작습니다.");
			}
			count++;
		}
		
		if(match) {
			System.out.printf("%d 번에 맞췄습니다.\n", count);
		}else {
			System.out.println("입력 회수를 초과헀습니다.");
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
