package com.woori.myhome.score;

public class ScoreDto {
	private String id;
	private String name;
	private int kor;
	private int mat;
	private int eng;
	
	
	
	public ScoreDto() {}
	
	public ScoreDto(String id, String name, int kor, int mat, int eng) {
		super();
		
		this.id= id;
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	
	public int gettotal() {
		return kor+mat+eng;
	}
	
	public int getevg() {
		return (kor+mat+eng)/3;
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
	
	
	
}
