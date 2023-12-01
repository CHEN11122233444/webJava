package day06;

public class WhileTest02 {
	public static void main(String[] args) {
		
		int value = 0;
		int count = 1;
		while(true) {
			value = (int)(Math.random()*50)+1;
			if(value==35) {
				break;
			}
			count++;
		}
		System.out.println("반복횟수: "+count);
		
		
		
	}
}
