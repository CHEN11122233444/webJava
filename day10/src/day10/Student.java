package day10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	private String myName;
	private int kor;
	private int eng;
	private int math;
	
	// 생성자 만들기
	public Student() {
		System.out.println("생성자 호출");
	}
	
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	// 총점
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	// 평균
	public double getAvg() {
		double avg = (double)this.getTotal()/3;
		return new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	
	
}
