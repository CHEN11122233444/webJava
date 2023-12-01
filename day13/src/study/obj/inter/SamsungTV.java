package study.obj.inter;

public class SamsungTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("전원켜짐");
		System.out.println("삼성");
	}

	@Override
	public void powerOff() {
		System.out.println("전원꺼짐");
		System.out.println("사랑합니다. 삼성");
	}
	
}
