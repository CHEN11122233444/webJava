package day06;

public class StarTest02 {
	public static void main(String[] args) {
		
		for(int i=0; i<7; i++) {
			// 공백찍기 - 하나씩 줄어든다.
			for(int j=(6-i); j>0; j--) {
				System.out.print(" ");
			}
			
			// 별찍기 - 하나씩 늘어난다
			for(int j=0; j<(i+1); j++) {
				System.out.print("*");
			}
			// 줄바꿈
			System.out.println();
		}
		
		System.out.println("================");
		
		
	}
}
