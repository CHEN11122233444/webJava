package practice.practice01;
import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		
		int[] pN =  new int [6]; // playNumbers : 플레이어가 입력하는 번호
		int[] sN = new int [7]; // systemNumbers : 시스템이 출력하는 당첨번호
		int[] wN = new int [6]; // winningNumbers : 당첨번호 출력용
		
		
		
		// 당첨번호 만들기
		for(int i=0; i<sN.length; i++) {
			int num = (int)(Math.random()*45)+1;
			sN[i] = num; 
			
			// 중복검사
			for(int j=0; j<i; j++) {
				if(num == sN[j]) {
					i--;
					break;
				}
			}
		}
		// System.out.println(Arrays.toString(sN));
		
		
		
		// 당첨번호 출력
		for(int i=0; i<sN.length-1; i++) {
			wN[i] = sN[i];
		}
		System.out.println(Arrays.toString(wN)+" + 보너스: "+sN[6]);


		
		// 플레이어 숫자 입력
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<pN.length; i++) {
			System.out.println((i+1)+"번 숫자 입력: ");
			pN[i] = scan.nextInt();
		}
		
		scan.close();
		// System.out.println(Arrays.toString(pN));
		
		
		
		int count = 0;
		// pN과 sN이 같을 때마다 count++
		
		boolean bonus = false;
		// 보너스 맞추면 bonus = true;
		
		// sN[6] : 보너스 -> pN의 길이만큼만 돌린 후 보너스 번호는 따로 판별
		for(int i=0; i<pN.length; i++) {
			for(int j=0; j<pN.length; j++) {
				if(pN[i]==sN[j]) {
					count++;
				}
			}
		}
		
		
		
		// 보너스 번호
		for(int i=0; i<pN.length; i++) {
			if(pN[i]==sN[6]) {
				bonus = true;
			}
		}
		
		
		
		// 당첨 여부 출력
		switch(count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			if(bonus) {
				System.out.println("2등");
				break;
			} else {
				System.out.println("3등");
			}
		case 4:
			System.out.println("4등");
			break;
		case 3:
			System.out.println("5등");
			break;
		default:
			System.out.println("꽝");
			break;
		}
		
		
		
		
	}
}
