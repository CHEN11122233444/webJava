package day10;

public class Person {
	
	public String myName;
	private int age;
	
	// setter
	public void setAge(int age) {
		this.age = age;
	}
	
	// getter
	public int getAge() {
		return this.age;
	}
	
	// 파라미터는 없고, 리턴은 있는 메서드
	public String myInfo() {
		String str = "이름: " +myName +", ";
		str += "나이: "+age;
		
		return str;
	}
}
