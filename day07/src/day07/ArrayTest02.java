package day07;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		// 배열의 최댓값 출력
		
//		int[] array03 = new int[10];
//		for(int i=0; i<array03.length; i++) {
//			array03[i] = (int)(Math.random()*50)+1; 
//		}
//		for(int i=0; i<array03.length; i++) {
//			System.out.println("array03["+i+"] = "+array03[i]);
//		}
//		
//		int max = 0;
//		int min = 100;
//		
//		for(int i=0; i<array03.length; i++) {
//			if(array03[i]>max) {
//				max = array03[i];
//			}
//		}
//		System.out.println("최댓값은: "+max);
		

		int[] array02 = new int[10];
		
		int max = 0; // 최대값 변수
		
		for(int i= 0; i < array02.length; i++) {
			int val = (int)(Math.random()*50)+1;
			array02[i] = val;
			
			if (max < val) {
				// 최대값 교체
				max = val;
			}
			
		}
		
		
		
		
		
	}
}
