package study.obj.global;

public class PrintMain {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		// 멤버 메서드 또는 변수는 인스턴스를 통해서 호출
		p.print(10);
		
		// 클래스 변수 또는 메서드는 클래스를 통해서 호출
		Printer.print(10.11);
		
		// 클래스 메서드는 인스턴트를 통해서도 호출이 가능하지만 하지 않는다.
		// p.print("안녕");
		
		double circleWidth = Math.pow(5, 2) * Printer.PI;
		System.out.println(circleWidth);

	}

}
