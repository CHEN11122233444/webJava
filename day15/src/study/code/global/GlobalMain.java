package study.code.global;

public class GlobalMain {
	public static void main(String[] args) {

		// 외부클래스의 객체선언 없이 바로 내부클래스 선언 가능
		InnerStatic.Inner st = new InnerStatic.Inner();
		
	}

}
