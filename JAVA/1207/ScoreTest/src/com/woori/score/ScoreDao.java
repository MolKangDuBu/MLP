package com.woori.score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScoreDao {
	
	List<ScoreDto> DList = new ArrayList<ScoreDto>();
	Scanner sc = new Scanner(System.in);
	
	
	public ScoreDao() {
		DList = Arrays.asList(new ScoreDto("홍길동", 90, 90, 90),
				new ScoreDto("둘리", 80, 50, 20),
				new ScoreDto("도우너", 90, 10, 80),
				new ScoreDto("마이클", 50, 70, 90)
				);
		
		
		
	}
	
	public void Sort() {
		List<ScoreDto>sort_DList =DList.stream()
				.sorted((X1, Y2)->{return X1.compareTo(Y2);}).toList();
		sort_DList.stream().forEach(System.out::println);
	}
	
	public void search() {
		String name ="";
		System.out.print("이름 : ");
		name =sc.next();
		
		ScoreDto dto = new ScoreDto(name, 0,0,0);
		List<ScoreDto> searchList=
		DList.stream().filter((X)->{return X.equals(dto);})
			.toList();
		
		if(searchList.size()==0) {
			System.out.println(name+"을 찾을 수 없음");
		}else {
			searchList.stream().forEach(System.out::println);
		}
	}
	
	public void output() {
		DList.stream().forEach(System.out::println);
	}
}
