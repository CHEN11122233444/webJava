package practice;

public class Test01 {

	private String color;
	private String model;
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}


	public void startEngine() {
		System.out.println("startEngine");
	}
	
	
	public static void main(String[] args) {
		
		Test01 car = new Test01();
		
		car.setColor("red");
		car.setModel("세단");
		
		car.startEngine();
		
	}

}
