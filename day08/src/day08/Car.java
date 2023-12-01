package day08;

public class Car {
	
	// 멤버변수 만들기
	String name;
	String company;
	String type;
	int price;
	int years;
	
	private boolean flag;
	
	
	// 정보를 출력하는 메서드
	public void printInfo() {
		String info ="";
		
		info += "제조사 :"+company+"\n";
		info += "이 름 :"+ name +"\n";
		info += "타 입 :"+ type +"\n";
		info += "연 식 :"+ years +"\n";
		info += "가 격 :"+ price +"만원";
		
		System.out.println(info);
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}
