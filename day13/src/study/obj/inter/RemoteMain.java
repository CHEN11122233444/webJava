package study.obj.inter;

public class RemoteMain {

	public static void main(String[] args) {
		
		// 클래스 - 인터페이스 관계는 인터페이스 구현체 역학을 함
		// 그래서 다형성을 이용한 객체 선언을 한다.
		RemoteControl sam = new SamsungTV();
		RemoteControl lg = new LGTV();
		
		sam.powerOn();
		sam.powerOff();
		
		lg.powerOn();
		lg.powerOff();
	}

}
