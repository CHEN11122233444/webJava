package practice.practice03;

public class Fruit {
	
	private String name;
	private String color;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	public void fruitInfo() {
		System.out.println(
				this.getName()+"는 이름 \n"+
				this.getColor()+"는 색깔 \n"+
				this.getScore()+"는 만족도"
		);
		
	}
	
	
	
	
	
	
	
	
	
	
}
