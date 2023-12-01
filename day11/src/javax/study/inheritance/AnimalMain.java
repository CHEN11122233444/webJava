package javax.study.inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		
		Cat cat = new Cat("고양이", "야옹", "생선");
		Dog dog = new Dog("강아지", "멍멍", "닭다리");
		
		
		cat.getInfo();
		dog.getInfo();
		dog.sleep();
		
		// 강아지를 다형성을 이용하여 만들어보자.
		// 다형성을 이용한 선언 - 부모타입을 이용한 객체 선언
		Animal dog2 = new Dog("강아지2", "왈왈", "소고기");
		
		dog.getInfo();
		// 부모타입으로 객체를 선언할 경우, 부모가 물려준 기능만 사용 가능
		// dog2.sleep();
	}

}
