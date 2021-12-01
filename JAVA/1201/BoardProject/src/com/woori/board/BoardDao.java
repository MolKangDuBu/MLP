package com.woori.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
	
	List<BoardDto> boardList = new ArrayList<BoardDto>();
	Scanner sc = new Scanner(System.in);
	
	
	
	public BoardDao() {
//		boardList.add(new BoardDto(1, "����1", "�ۼ���1","����1"));
//		boardList.add(new BoardDto(2, "����2", "�ۼ���2","����2"));
//		boardList.add(new BoardDto(3, "����3", "�ۼ���3","����3"));
//		boardList.add(new BoardDto(4, "����4", "�ۼ���4","����4"));
//		boardList.add(new BoardDto(5, "����5", "�ۼ���5","����5"));
	}
	
	
	public void Start() {
		int Input;
		
		while(true) {
			Display();
			Input = sc.nextInt();
			sc.nextLine();
			switch(Input) {
			case 1:
				append();
				break;
			case 2:
				output();
				break;
			case 3:
				Search();
				break;
			case 0:
				return;
				default:
					System.out.println("���� �߻�");
			
			}
		}
		
	}
	public void Display() {
		System.out.println("--------------------");
		System.out.println("1. �Խñ� �ۼ�");
		System.out.println("2. �Խñ� ��ȸ");
		System.out.println("3. �˻�");
		System.out.println("0. ����");
		System.out.println("--------------------");
	}
	
	public void Search() {
		String name ="";
		System.out.print("�̸� : ");
		name = sc.next();
		boolean found = false;
		BoardDto find = null;
		for(BoardDto dto : boardList) {
			if(dto.getWriter().equals(name)) {
				found=true;
				find=dto;
				break;
			}
		}
		if(found) {
			System.out.println(find.getId()+" "+find.getTitle()+" "
					+find.getContents()+" "+find.getWriter()+" "+find.getHit()+" "+find.getWdate());
		}
		
	}
	
	
	public void append() {
		BoardDto dto = new BoardDto();
		int id =boardList.size()+1;
		System.out.print("�����Է� : ");
		String title = sc.nextLine();
		System.out.print("�ۼ��� �Է� : ");
		String writer =sc.nextLine();
		System.out.print("�����Է� : ");
		String content = sc.nextLine();
		
		boardList.add(new BoardDto(id,title,writer,content));
	}
	
	public void output() {
		for(BoardDto dto:boardList) {
			System.out.println(dto.getId()+" "+dto.getTitle()+" "
							+dto.getContents()+" "+dto.getWriter()+" "+dto.getHit()+" "+dto.getWdate());
		}
	}
	

}
