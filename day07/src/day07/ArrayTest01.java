package day07;

public class ArrayTest01 {
	public static void main(String[] args) {
		
		int array01[] = new int[5];
		int[] array02 = new int[4];
		
		for(int i=0; i<array02.length; i++) {
			array02[i] = (int)(Math.random()*50)+1; 
		}
		for(int i=0; i<array02.length; i++) {
			System.out.println("array02["+i+"] = "+array02[i]);
		}
		
		
	}
}
