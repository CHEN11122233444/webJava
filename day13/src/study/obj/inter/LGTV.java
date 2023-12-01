package study.obj.inter;

public class LGTV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("전원켜짐");
		System.out.println("사랑합니다 LG!!");
	}

	@Override
	public void powerOff() {
		System.out.println("전원꺼짐");
		System.out.println("사랑합니다 LG!!");
		
	}

}
