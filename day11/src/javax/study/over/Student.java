package javax.study.over;

public class Student {
	private String myName;
	private int age;
	
	
	// overload - 같은 이름을 가진 또 다른 메서드를 만들 수 있다
	// 단, 파라미터의 개수가 다르거나, 개수는 같더라도 타입을 다르게 해야 가능
	public Student(String myName, int age) {
		// this.myName = myName;
		// this.age = age;
		this.setMyName(myName);
		this.setAge(age);
	}
	
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
