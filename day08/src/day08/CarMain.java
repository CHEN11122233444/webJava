package day08;

public class CarMain {
	public static void main(String[] args) {
		
		// 클래스 선언 or 객체 선언 or 객체화 or 인스턴스화
		Car car = new Car();
		
		// 클래스가 가진 변수 또는 메서드를 사용하기 위해서
		// 연결고리 .(닷)을 사용한다.
		
		car.company = "현대";
		car.name = "소나타";
		car.type = "중/대형";
		car.price = 3000;
		car.years = 2023;
		
		// 메서드 호출
		car.printInfo();
		
	}
}
