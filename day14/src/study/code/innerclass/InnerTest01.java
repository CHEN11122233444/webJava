package study.code.innerclass;

import java.util.Scanner;

public class InnerTest01 {
	
	// 인스턴스 클래스 1
	private Scanner scan;
	
	// 생성자를 통한 선언
	public InnerTest01() {
		// 멤버로 지니는 객체가 있다면 보통 생성자를 통한 선언을 가진다.
		scan = new Scanner(System.in);
	}
	
	// 스캐너 종료 함수
	public void scanClose() {
		if(scan != null) {
			scan.close();
		}
	}
	
	public static void main(String[] args) {
		
		InnerTest01 in = new InnerTest01();
		System.out.println("숫자를 입력하세요.");
		int number = in.scan.nextInt();
		
		System.out.println("입력: "+number);
		in.scanClose();
	}

	
	
	
	
	
	
}
