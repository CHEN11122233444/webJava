package day03;

public class ChangeValueTest {

	public static void main(String[] args) {
		
		int num = 10;
		long lv01 = 0;
		
		// 자동 형변환
		// 보통 작은 타입의 값을 큰 타입 변수에 대입할 때 진행된다.
		lv01 = num;
		
		System.out.println(lv01);
		
		// 강제 형변환
		
		// 오류!
		// num = lv01;
		num = (int)lv01;
		
		// 숫자 강제 형변환 
		num = (int)10;
		
		char ch = 'B';
		int convert = 0;
		
		// 문자는 아스키 코드표에 의하여 대응하는 숫자값이 있기에 자동형변환 가능
		convert = ch;
		
		String str = "";
		
		// 문자 <--> 문자열 - 서로 기본형변환 불가능
		// str = (String)ch;
		// ch = str;
		
		System.out.println(ch+ " 문자 변환 = "+ convert);
		int sum = 0;
		int value = 10;
		
		// 증감연산자가 앞에 놓이는 경우
		sum = ++value;
		System.out.println("sum =" + sum + ", value = "+ value);
		
		// 증감연산자가 뒤에 놓이는 경우
		sum = value++;
		System.out.println("sum =" + sum + ", value = "+ value);
		
		
		
		

	}

}
