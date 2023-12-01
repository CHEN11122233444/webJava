package practice.practice01;

public class iPhone {
	
	// 멤버변수
	String name;
	String company;
	String color;
	int capacity;
	int memory;
	
	// 정보를 출력하는 메서드
	public void information() {
		
		String info = "";
		
		info += "상품명: " +name +"\n";
		info += "제조사: " +company +"\n";
		info += "색 상: " +color +"\n"; 
		info += "용 량: " +capacity +" GB\n";
		info += "메모리: " +memory +" GB";
		
		System.out.println(info);
		
	}
	
	
	
	
}
