package day04;

public class IfTest02 {

	public static void main(String[] args) {
		
		// 랜덤함수로 60~ 100 사이 랜덤값 만들기
		int value = (int)(Math.random() * (100-60) +1) + 60;
		
		if(value >= 75) {
			System.out.println("점수: "+value+", 합격");
		}else {
			// 75미만이면 불합격
			System.out.println("점수: "+value+", 불합격");
		}

	}

}
