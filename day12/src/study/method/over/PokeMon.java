package study.method.over;

public class PokeMon {
	
	private String myName;
	
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	public String getMyName() {
		return this.myName;
	}
	
	// 공격
	public void attack() {
		System.out.println(this.getMyName() + "가(이) 공격합니다!");
	}
}
