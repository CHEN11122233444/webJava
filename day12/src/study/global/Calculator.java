package study.global;

public class Calculator {
	
	
	// 1. 변수에 static 붙이는 경우
	// static 붙이는 변수는 대부분 public 선언
	// 보통 상수를 만들 때 많이 사용
	// 상수는 특이하게 네이밍이 모두 대문자 처리
	// 그래서 음절을 이을 때 언더바(_)를 사용한다.
	
	public static final double PI = 3.14;
	
	// 2. static 메서드에서 사용할 변수를 만들 때 사용
	private static int r = 5;
	
	// 클래스 메서드 만들기
	// 1. 자주 사용하는 메서드를 객체 선언 없이 사용하려 할 때 만든다.
	public static double circleWidth() {
		return r * r *PI;
	}
}
