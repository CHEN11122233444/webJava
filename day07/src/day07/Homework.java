package day07;

public class Homework {

	public static void main(String[] args) {
		
		for(int i=1; i<8; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=7; j>(i-1); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		for(int i=0; i<7; i++) {
			
			// 공백찍기 - 하나씩 줄어든다.
			for(int j=(6-i); j>0; j--) {
				System.out.print(" ");
			}
			// 별찍기 - 하나씩 늘어난다
			for(int j=0; j<(2*i+1); j++) {
				System.out.print("*");
				// 0 1 2 3 4 5 6 
			}
			
			// 줄바꿈
			System.out.println();
		}

		
	}

}
