package practice;

//클래스 정의
class Car {
	
 // (인스턴스)멤버 변수
 String color;
 String model;

 // 멤버 메서드
 void startEngine() {
     System.out.println("Engine started!");
 }
}

public class CarMain {
 public static void main(String[] args) {
	 
     // 객체(인스턴스) 생성
     Car myCar = new Car();

     // 객체의 멤버 변수 설정
     myCar.color = "Blue";
     myCar.model = "Sedan";

     // 객체의 메서드 호출
     myCar.startEngine();
 }
}

/*

클래스(Class):
클래스는 객체를 생성하기 위한 설계도 또는 틀입니다.
프로그램에서 사용되는 데이터와 메서드(함수)를 포함합니다.
예를 들어, 자동차 클래스는 자동차의 속성(색상, 모델 등)과 동작(시동 켜기, 정지 등)을 정의합니다.

객체(Object):
객체는 클래스의 인스턴스(실제로 메모리에 할당된 것)입니다.
클래스의 설계도를 기반으로 생성된 실제 데이터를 포함한 것으로, 프로그램에서 실제로 사용됩니다.
자동차 클래스로부터 생성된 특정 자동차 객체는 실제 자동차의 특정 인스턴스입니다.

멤버(Member):
멤버는 클래스 내부에 포함된 변수(속성)와 메서드(동작)를 의미합니다.
변수는 클래스의 데이터를 저장하고, 메서드는 클래스의 동작을 정의합니다.
자동차 클래스에서는 색상이나 모델 같은 변수와 시동 켜기, 정지 등의 메서드가 멤버에 해당합니다.

인스턴스(Instance):
인스턴스는 클래스를 기반으로 실제 메모리에 할당된 객체를 말합니다.
클래스로부터 여러 개의 인스턴스를 생성할 수 있습니다.
예를 들어, 자동차 클래스로부터 생성된 한 대의 자동차가 해당 클래스의 인스턴스입니다.

*/