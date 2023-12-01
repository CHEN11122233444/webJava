package study.code.innerclass;

public class Calc {
	
	private int val1;
	private int val2;
	
	public Calc(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	
	/**
	 * 클래스의 정적메서드 또는 변수는
	 * 일반 메서드 내에서 사용이 가능하다.
	 * 이유는 일반 메서드를 실제 호출하여 사용할 때는
	 * 객체를 선언하여 인스턴스화 되었을 때이기 때문
	 * 그때는 객체도 사용메모리(heap)에 등록되어
	 * 사용가능한 상태가 되기 때문
	 * @return
	 */
	
	public double avg() {
		double avg = (double)add()/3;
		return avg();
	}
	
	public static int add() {
		return 10 + 5; 
	}
	
	// 실제 계산하는 내부 클래스 - 인스턴스 클래스
	// 기존에는 내부클래스에서 외부클래스의 정적키워드를 사용 못하고
	// 내부클래스 내에서 상수를 제외하고 static 키워드를 못썻으나
	// 현재 jdk17버전에서는 다 허용
	public class Calculator{
		public int add() {
			// 일반적인 내부클래스는 외부 클래스의 멤버변수나 메서드 사용가능
			return val1 + val2;
		}
		
		public int minus() {
			return val1 - val2;
		}
		
	}
	
}
