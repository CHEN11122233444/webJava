package javax.study.inheritance;

public class Dog extends Animal	{
	
	public Dog(String myName, String sound, String eat) {
		this.setMyName(myName);
		this.setSound(sound);
		this.setEat(eat);
	}
	
	public void sleep() { 
		System.out.println(this.getMyName()+"이 잡니다..");
	}
}
