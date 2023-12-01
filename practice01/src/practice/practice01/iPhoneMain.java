package practice.practice01;

public class iPhoneMain {
	public static void main(String[] args) {
		// 클래스 선언
		iPhone a = new iPhone();
		
		a.name = "아이폰15 pro";
		a.company = "애플";
		a.color = "블랙 티타늄";
		a.capacity = 256;
		a.memory = 8;
		
		// 메서드 호출
		a.information();
		
	}
}
