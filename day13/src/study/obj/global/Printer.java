package study.obj.global;

import java.util.Scanner;

public class Printer {
	
	
	/**
	 *  상수 네이밍 규칙
	 *  1. 대문자만 사용
	 *  2. 음절이 2음절 이상일 경우 각 음절 사이를 언더바로 잇기	
	 * 
	 */
	public static final double PI = 3.14;
	public static final Scanner scan = new Scanner(System.in);
	
	private int round = 5;
	
	// 일반 메서드
	public void print(int num) {
		System.out.println(num);
	}
	
	// static 메서드
	public static void print(double d) {
		System.out.println(d);
	}
	
	/**
	 * 
	 * static 메서드 내부에서는
	 * 클래스가 가지는 멤버변수 또는 메서드를 사용할 수 없다.
	 * @param str
	 */
	public static void print(String str) {
		System.out.println(str);
	}
}
