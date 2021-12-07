package com.woori.score;

public class ScoreDto implements Comparable{
	private String name="";
	private int kor=0;
	private int eng=0;
	private int mat =0;
	private int total = 0;
	
	public ScoreDto() {
		
	}
	
	public ScoreDto(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		Calculator();
	}
	

	
	public void Calculator() {
		this.total = kor+eng+mat;
	}
	
	@Override
	public String toString() {

		// TODO Auto-generated method stub
		return String.format("%s %d %d %d %d", name, kor, eng, mat, total);
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		ScoreDto temp = (ScoreDto)o;
		
		return this.total-temp.total;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		ScoreDto temp = (ScoreDto)obj;
		return  this.name.equals(temp.name);
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
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}


	
	
	
}
