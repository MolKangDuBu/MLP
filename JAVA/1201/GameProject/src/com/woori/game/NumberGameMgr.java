package com.woori.game;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberGameMgr {

	ArrayList<NumberGame> list = new ArrayList<NumberGame>();
	Scanner sc = new Scanner(System.in);
	public void start(){
		do {
			System.out.println("1. ���ӽ���");
			System.out.println("2. ����   ");
			System.out.println("3. ����");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				NumberGame ng = new NumberGame();
				list.add(ng);
				ng.start();
				break;
			case 2:
				displayHistory();
				break;
			case 3:
				return;
			}
		}while(true);
	}
	
	public void displayHistory() {
//		System.out.println("Computer\tPlayer          Answer\tCount");
		for(NumberGame game: list) {
			System.out.print(game.getComputer()+"\t"+game.getPerson()+"\t\t"
							+game.isMatch()+"\t"+game.getCount());
			System.out.println();
			
		}
		int cnt=0;
		for(NumberGame game: list) {
			if(game.match)
				cnt++;
		}
		System.out.printf("�� %d�� �õ��ؼ� %d �� ������ϴ�.\n�·��� %d%%�Դϴ�.",list.size(), cnt, (int)(cnt/list.size())*100);
		
		
	}
}
