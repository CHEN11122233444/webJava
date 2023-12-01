package day06;

public class Gugudan {

	public static void main(String[] args) {
		
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				// 2x1=2 2x2=4 ...2x9=18
//				System.out.print(i+"X"+j+"="+(i*j)+"\t");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+"X"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		

	}

}
