package study.code.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	private String myName;
	private int kor;
	private int eng;
	private int math;
	
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
	
	
	// 총점을 구하는 메서드
	public int getTotal() {
		return(this.getKor()+this.getMath()+this.getEng());
	}
	
	// 평균을 구하는 메서드
	public double getAvg() {
		double avg = (double)this.getTotal()/3;
		return new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "이름: " + this.getMyName()+", ";
		str += "국어: " + this.getKor()+", ";
		str += "영어: " + this.getEng()+", ";
		str += "수학: " + this.getMath()+", ";
		str += "총점: " + this.getTotal()+", ";
		str += "평균: " + this.getAvg()+"\n";
		return str;
	}
	
	
	
	
	
	
	
	

}
