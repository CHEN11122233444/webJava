package day05;

public class ContinueTest {
	public static void main(String[] args) {
		
		int value = 0;
		int sum = 0;
		
		for(int i=10; i>0; i--) {
			value = (int)(Math.random()*50)+1;
			
			if(value%2==0) {
				continue;
			}
			
			sum = sum + value;
			System.out.println(value+", ");
		}
		
		System.out.println("\n홀수 합: "+sum);
		
	}
}
