package day09;

import java.util.Arrays;
import java.util.Scanner;

public class MyLotto {
	public static void main(String[] args) {
		// 1. 로또!
		// 2. 1 ~ 45 사이의 번호 중 숫자를 뽑아만든다!
		// 3. 시스템은 6개 번호 + 1개의 보너스 번호
		// 4. 플레이어는 6개의 번호!
		// 5. 시스템은 랜덤함수 이용
		// 6. 플레이어는 스캐너 사용
		
		int[] machine = new int[45];
		
		// 기계에 1~45번 공 넣기
		for(int i=0; i<45; i++) {
			machine[i] = (i+1);
		}
		
		int count = 0; // 뽑힌 공 개수
		int[] system = new int[6];
		int bonusNumber = 0;
		
		
		
		while(true) {
			
			// 랜덤 인덱스 구하기(0~44)
			int index = (int)(Math.random()*45);
			
			if(machine[index] == 0) {
				continue;
			}
			// 카운트가 6이면 6개 다 뽑았으니 보너스 번호 뽑고 끝
			if(count==6) {
				bonusNumber = machine[index];
				break;
			}
			
			// 카운트가 6이 아닐 때까지 온다.
			system[count++] = machine[index];
			machine[index] = 0; // 공을 뽑은 위치값을 0으로 바꿈
			
		}
		System.out.println("로또번호: "+Arrays.toString(system)+", 보너스: "+bonusNumber);
		
		
		count = 0;
		int[] myLotto = new int[6];
		Scanner scan = new Scanner(System.in);
		
		
		
		while(count<6) {
			System.out.println((count+1)+" 번째 로또");
			int val = scan.nextInt();
			
			// 입력내용 확인
			if(val<1 || val>45) {
				System.out.println("로또 번호는 1에서 45 사이여야합니다.");
				continue; // 입력된 숫자가 유효하지 않기에 진행할 필요가 없으니 재시도
			}
			
			// 중복처리를 위한 루프
			for(int i=0; i<count; i++) {
				if(myLotto[i]==val) { // 기존값과 입력값이 같다면 중복
					val = 0; // 중복된 값이 있다면 0 처리
					break;
				}
			}
			
			// val 값이 0이 아니라면 중복값이 아니니 추가한다.
			if(val != 0) {
				// 로또번호를 삽입하고 count 증가
				myLotto[count++] = val;
			}
		}
		
		// 스캐너 닫기
		scan.close();
		
		// 선택된 로또 출력하기
		System.out.println("내 로또 번호"+Arrays.toString(myLotto));
		
		// 비교하기
		int[] luckyNumber = new int[6];
		int luckyCount = 0; // 맞은 개수
		// 보너스번호 찾았나
		boolean isBonus = false;
		
		for(int i=0; i<myLotto.length;i++) {
			// 로또 메인번호 비교
			for(int j=0; j<system.length; j++) {
				if(myLotto[i]==system[j]) {
					luckyNumber[luckyCount++] = myLotto[i];
					break;
				}
				
			}
			if(!isBonus) {
				if(myLotto[i]==bonusNumber) {
					isBonus=true;
				}
			}
		}
		
		System.out.print("맞은 로또 번호: ");
		
		for(int i=0; i<luckyCount; i++) {
			System.out.print(luckyNumber[i]+" ");
		}
		System.out.println(luckyCount==5 && isBonus ? ", 보너스번호 :"+bonusNumber : "");
		
		if(luckyCount==6) {
			System.out.println("로또 1등");
		}else if(luckyCount==5 && isBonus) {
			System.out.println("로또 2등");
		}else if(luckyCount==5) {
			System.out.println("로또 3등");
		}else if(luckyCount==4) {
			System.out.println("로또 4등");
		}else if(luckyCount==3) {
			System.out.println("로또 5등");
		}else {
			System.out.println("꽝");
		}
		
		
		
	}
}	
