package day07;

import java.util.Arrays;
import java.util.Collections;

public class ArrayBubbleSort {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*30)+1;
		}
		
		System.out.println("정렬 전: "+Arrays.toString(arr));
		
		
		// 버블 정렬 시작
		int temp = 0; // 임시변수
		
		for(int i=(arr.length-1); i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1]; // 임수변수 뒤에 숫자를 저장
					arr[j+1] = arr[j]; // 현재 위치값을 뒤로 보냄 
					arr[j] = temp; // 임수변수에 저장했던 값을 현재 위치에 넣는다.
					
				}
			}
			
		}
		
		// Arrays를 사용한 내림차순 정렬방법
		// 현재 배운걸로는 해결 불가, 나중에 확인
		// Arrays.sort(arr, Collections.reverseOrder());
		
		// 오름차순
		Arrays.sort(arr);
		
		System.out.println("오름 정렬 후: "+Arrays.toString(arr));
		
		
		
	}
}	
