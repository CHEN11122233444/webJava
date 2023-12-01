package day04;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfTest03 {
	public static void main(String[] args) {
		int value = (int)(Math.random()*(100-40) +1) +40;
		int value2 = (int)(Math.random()*(100-40) +1) +40;
		
		double avg = (double)(value+value2)/2;
		// 소수점 구하기 - 수를 다루는 BigDecimal 이용
		BigDecimal big = new BigDecimal(avg);
		// 소수점 2째자리 표현, 반올림
		avg = big.setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		if(avg >=60 && value>=45 && value2>=45) {
			System.out.println("과목1:"+value+", 과목2:"+value2+", 평균:"+avg);
			System.out.println("합격");
		}else {
			System.out.println("과목1:"+value+", 과목2:"+value2+", 평균:"+avg);
			System.out.println("불합격");
		}
		
	}

}
