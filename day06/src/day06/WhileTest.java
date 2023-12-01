package day06;

public class WhileTest {
	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		while(count <=10) {
			sum = sum + count;
			count++;
		}
		System.out.println("합: "+sum);
		
		
		count = 0;
		while(count<7) {
			for(int i=0; i<(count+1); i++) {
				System.out.print("*");
			}
			count++;
			System.out.println();
		}
		
		
		
	}
}
