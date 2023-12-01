package practice.practice03;

public class Apple extends Fruit {
	
	public Apple(String name, String color, int score) {
		this.setName(name);
		this.setColor(color);
		this.setScore(score);
	}
	
	public void taste() {
		System.out.println(
				this.getColor()+"의 "+
				this.getName()+"는 "+
				this.getScore()+"점짜리 맛입니다."
		);
	}
	
}
