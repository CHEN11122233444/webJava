package day04;

import java.util.Scanner;

public class IfTest04 {
	public static void main(String[] args) {
		
		int score = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 입력: ");
		score = scan.nextInt();
		
		if(score>=90) {
			System.out.println("점수 :"+score+", 학점: A");
		}else if(score>=80) {
			System.out.println("점수 :"+score+", 학점: B");
		}else if(score>=70) {	
			System.out.println("점수 :"+score+", 학점: C");
		}else if(score>=60) {	
			System.out.println("점수 :"+score+", 학점: D");
		}else {
			System.out.println("점수 :"+score+", 학점: F");
		}
		scan.close();
	}
}
