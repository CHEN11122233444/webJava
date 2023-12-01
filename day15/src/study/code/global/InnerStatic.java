package study.code.global;

public class InnerStatic {
	
	private int count = 0;
	private static int account = 10;
	
	// 정적 내부클래스
	public static class Inner{
		public void print() {
			
			// 정적 내부클래스는 외부클래스의 일반 멤버변수나 메서드 사용 불가
			// System.out.println(count);
			// 외부클래스의 클래스 변수 또는 메서드는 사용 가능
			
		}
	}
}
