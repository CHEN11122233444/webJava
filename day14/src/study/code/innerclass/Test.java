package study.code.innerclass;

import java.util.Scanner;

public class Test {
	
		private Scanner scan;
		
		// 생성자를 통한 선언
		public Test() {
			// 멤버로 지니는 객체가 있다면 보통 생성자를 통한 선언을 가진다.
			scan = new Scanner(System.in);
		}
		
		// 스캐너 종료 함수
		public void scanClose() {
			if(scan != null) {
				scan.close();
			}
		}
}
