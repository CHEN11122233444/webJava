package day08;

public class DoubleArrayTest {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4]; // 기본적인 선언 방법
		int[][] arr02 = new int[3][]; // 행만 부여하고 열은 생략 가능 - 나중에 열을 선언해줘야함
		int[][] arr03 = { {1,2,3}, {4,5,6}, {7,8,9}}; // 최초 선언시에만 가능
		
		int[][] arr04 = { {1,2,3,10}, {4,5}, {7,8,9,11,12,13}}; 
		
		// arr02 행에 대한 열 부여
		for(int i=0; i<arr02.length; i++) {
			arr02[i] = new int[i+1];
		}
		
		for(int i=0; i<arr04.length; i++) {
			for(int j=0; j<arr04[i].length; j++) {
				System.out.print(arr04[i][j]+"\t");
			}
			System.out.println();
		}
 
	}

}
