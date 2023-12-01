package day10;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		
		
		// 학생 3명을 넣을 수 있는 배열 만들기
		Student[] stArray = new Student[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<stArray.length; i++) {
			
			// 학생 객체 만들기
			Student st =new Student();
			
			System.out.println((i+1)+"번째 학생 이름: ");
			st.setMyName(scan.next()); // 문자를 입력
			System.out.println((i+1)+"번째 학생 국어: ");
			st.setKor(scan.nextInt()); 
			System.out.println((i+1)+"번째 학생 영어: ");
			st.setEng(scan.nextInt()); 
			System.out.println((i+1)+"번째 학생 수학: ");
			st.setMath(scan.nextInt()); 
			
			// 배열에 저장
			stArray[i] = st;
			
		}
		
		scan.close();
		
		Student maxStd = null;
		
		for(int i=0; i<stArray.length; i++) {
			// 최고점자가 없다면, 현재 학생이 최고점자가 된다.
			if(maxStd==null) {
				maxStd = stArray[i];
			}else {
				// 현재 최고점인 학생보다 비교대상 학생의 총점이 높으면 교체
				if(maxStd.getTotal()<stArray[i].getTotal()) {
					maxStd = stArray[i];
				}
			}
		
		}
		
		
		// 출력
		for(int i=0; i< stArray.length; i++) {
			Student st = stArray[i];
				
			// 학생 정보 출력
			System.out.print("이름: "+st.getMyName());
			System.out.print(", 국어: "+st.getKor());
			System.out.print(", 영어: "+st.getEng());
			System.out.print(", 수학: "+st.getMath());
			System.out.print(", 총점: "+st.getTotal());
			System.out.println(", 평균: "+st.getAvg());
		}
		
		// 최고점자 학생의 이름과 총점 출력하기
		System.out.println("최고점자: "+ maxStd.getMyName()+", 총점: "+maxStd.getTotal());
		
		
	}

}
