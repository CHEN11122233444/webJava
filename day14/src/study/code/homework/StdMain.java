package study.code.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		
		// 학생 5명을 만들어라
		Student[] stArray = new Student[5];
		Scanner scan = new Scanner(System.in);
		double avgKor = 0;
		double avgEng = 0;
		double avgMath = 0;
		
		
		// 학생 값을 입력
		for(int i=0; i<stArray.length;i++) {
			// 학생 객체 선언
			Student st = new Student();
			System.out.println( (i+1)+"번째 학생 이름: ");
			st.setMyName(scan.next());
			System.out.println( (i+1)+"번째 학생 국어: ");
			st.setKor(scan.nextInt());
			System.out.println( (i+1)+"번째 학생 영어: ");
			st.setEng(scan.nextInt());
			System.out.println( (i+1)+"번째 학생 수학: ");
			st.setMath(scan.nextInt());
			
			// 배열에 학생 넣기
			stArray[i] = st;
			
			// 평균계산을 위해 각 과목마다 입력된 값을 누적
			avgKor += st.getKor();
			avgEng += st.getEng();
			avgMath += st.getMath();
		}
		
		// 버블 정렬
		Student temp = null;
		for(int i=(stArray.length-1);i>0;i--) {
			for(int j=0; j<i; j++) {
				if(stArray[j].getTotal()<stArray[j+1].getTotal()) {
						temp = stArray[j+1];
						stArray[j+1] = stArray[j];
						stArray[j] = temp;
					}
				}
		}
		
		// 출력
		System.out.println(Arrays.toString(stArray));
		
		System.out.println("최고점자: "+stArray[0].getMyName()+
							", 총점: "+stArray[0].getTotal());
		System.out.println("----------------------------");
		System.out.println("최저점자: "+stArray[4].getMyName()+
							",총점: "+stArray[4].getTotal());
		
		// 각 과목 평균점수
		System.out.println("국어평균: "+StdMain.getAvg(avgKor/5));
		System.out.println("영어평균: "+StdMain.getAvg(avgEng/5));
		System.out.println("수학평균: "+StdMain.getAvg(avgMath/5));
	}
	
	public static double getAvg(double val) {
		return new BigDecimal(val).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}

}
