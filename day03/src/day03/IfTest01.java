package day03;

import java.util.Scanner;

public class IfTest01 {
	public static void main(String[] args) {
		
		// Scanner 사용
		Scanner scan = new Scanner(System.in);
		
		int value = 0;
		System.out.println("값을 넣어주세요.");
		value = scan.nextInt(); // 정수값 읽기
		
		// 입력된 값이 10 이상이면 합격을 출력
		if(value >= 10) {
			System.out.println("합격");
			System.out.println("종료");
		}
		
		// 사용 후 닫아줘야 함 
		scan.close();
		
	}
}
