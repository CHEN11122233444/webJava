package day05;

public class Quiz01 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("합: "+sum);
		
		
		sum = 0;
		// 1 + 3 + 5 +7 .... 97 + 99
		for(int i=1; i<=100; i=i+2) {
			sum += i;
		}
		System.out.println("합: "+sum);
		
		
		sum = 0;
		for(int i=1; i<=100; i++) {
			
			if(i%2==1) {
				sum += i;
			}
		}
		System.out.println("합: "+sum);
		
		
	}

}
