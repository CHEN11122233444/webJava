package study.code.innerclass;

public class CalcMain {
	public static void main(String[] args) {
		
		// 내부클래스 사용하기 위한 선언은 2개의 단계를 거친다.
		// 1. 외부클래스 객체화
		// 2. 외부인스턴스를 이용한 내부클래스 객체화
		Calc cal = new Calc(21, 10);
		Calc.Calculator calc = cal.new Calculator();
		
		System.out.println("더하기: "+calc.add());
		System.out.println("빼기: "+calc.minus());
		
		
		
	}
}
