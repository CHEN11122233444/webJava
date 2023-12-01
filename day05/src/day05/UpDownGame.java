package day05;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		
		int solution = (int)(Math.random()*50)+1;
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		// 반복횟수
		int count = 0;
		
		for(int i =0; i<10; i++) {
			System.out.println((count+1) + " 번째 도전!");
			System.out.println("찾을 숫자: ");
			input = scan.nextInt();
			
			if(input == solution) {
				System.out.println("맞췄다!!");
				System.out.println((count+1) + " 번째에 맞춤!");
				break;
			}else if(input>solution) {
				System.out.println("Down");
			}else {
				System.out.println("UP");
			}
			count++;
		}
		
		if(count ==10) {
			System.out.println("찾아야 하는 수는: "+solution+"이었습니다....");
		}
		
		//스캐너 종료
		scan.close();
	}
}
