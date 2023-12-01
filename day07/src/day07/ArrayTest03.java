package day07;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			// 랜덤값
			int val = (int)(Math.random()*50)+1;
			arr[i] = val;
			
			// 중복찾기
			for(int j=0; j<i; j++ ) {
				if(val == arr[j]) {
					i--; // 증감식에 의해서 증가할 것이니 하나 빼놓으면 제자리
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr)); // for문을 돌리지 않고 배열 출력
		
		
	}
}
