package day03;

public class OperatorTest {

	public static void main(String[] args) {
		
		byte bvalue = 10;
		int ivalue = 15;
		long lvalue = 30;
		double dvalue = 30.33;
		
		byte bsum = 0;
		int isum = 0;
		long lsum = 0;
		double dsum = 0;
		
		// 오류, byte끼리 연산해도 결과는 int
		// bsum = bvalue * bvalue;
		
		// 형식은 맞아도 결과값이 저장변수의 범위를 넘어가면 값이 이상해진다.
		isum = 2100000000 + 2100000000;
		System.out.println(isum);
		
		// int 범위 이상의 연산대상의 결과값은 대상 중 가장 범위가 큰 데이터 타입으로 결정된다.
		dsum = 30 + lvalue + dvalue;
		
		// 비교연산
		System.out.println(3>4);
		System.out.println(10 == bvalue);
		// and기호(A && B) -> 두 조건이 모두 만족해야 참이 나온다.
		System.out.println(bvalue == 10 && 3>4);
		
		// or기호(A || B) -> 두 조건 중 하나만 만족해도 참이 나온다.
		System.out.println(bvalue == 10 || 3>4);
	}

}
