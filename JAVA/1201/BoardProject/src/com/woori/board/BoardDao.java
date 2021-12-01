package com.woori.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
	
	List<BoardDto> boardList = new ArrayList<BoardDto>();
	Scanner sc = new Scanner(System.in);
	
	
	
	public BoardDao() {
//		boardList.add(new BoardDto(1, "제목1", "작성자1","내용1"));
//		boardList.add(new BoardDto(2, "제목2", "작성자2","내용2"));
//		boardList.add(new BoardDto(3, "제목3", "작성자3","내용3"));
//		boardList.add(new BoardDto(4, "제목4", "작성자4","내용4"));
//		boardList.add(new BoardDto(5, "제목5", "작성자5","내용5"));
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
					System.out.println("에러 발생");
			
			}
		}
		
	}
	public void Display() {
		System.out.println("--------------------");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 조회");
		System.out.println("3. 검색");
		System.out.println("0. 종료");
		System.out.println("--------------------");
	}
	
	public void Search() {
		String name ="";
		System.out.print("이름 : ");
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
		System.out.print("제목입력 : ");
		String title = sc.nextLine();
		System.out.print("작성자 입력 : ");
		String writer =sc.nextLine();
		System.out.print("내용입력 : ");
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
