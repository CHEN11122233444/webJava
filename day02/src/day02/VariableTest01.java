package day02;

public class VariableTest01 {
	
	public static void main(String[] args) {
		// 한줄 주석
		/*
		 * 여러줄 설명 주석
		 * 
		 */
		
		
		// 정수 선언
		int inValue01 = 10;
		byte byValue01 = 5;
		double dValue01 = 30.44;
		
		int inValue02;
		
		// 초기화 해야 하는 이유
		// inValue02 = inValue02 + 10;
		
		// float을 안 쓰는 이유
		float fValue = 10.33F; // F를 쓰면 float이란 뜻
		
		char ch01 = '\0';
		/*
		 * char 즉 문자는 실제로 컴퓨터 상에서 숫자로 저장된다.
		 * 컴퓨터의 문자와 숫자를 대응하는 규칙을 정의해놓은 규격표를 아스키코드표 라고 한다.
		 * 때문에 문자 타입일지라도, 숫자값을 대입할 수 있다.
		 */
		char ch02 = 97;
		String str = "";
		
		// 출력할 내용이 있어야한다.
		// System.out.print();
		System.out.println(); // 기본적으로 줄바꿈이 들어있다.(공백이어도 오류X)
		
		System.out.print(ch02);
		System.out.println(dValue01);
		
		str = "안녕하세요";
		System.out.println(str);
		
	}
}
