package practice;

class Example {
    static int classVariable;       // 클래스 변수
    int instanceVariable;           // 인스턴스 변수
    int anotherInstanceVariable;    // 또 다른 인스턴스 변수

    Example(int value) {
        instanceVariable = value;
        anotherInstanceVariable = value * 2;
    }

    void printVariables() {
        System.out.println("Class Variable: " + classVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Another Instance Variable: " + anotherInstanceVariable);
    }
}

public class VariableMain {
    public static void main(String[] args) {
        Example.classVariable = 10;  // 클래스 변수 설정

        Example instance1 = new Example(5);  // 첫 번째 인스턴스 생성
        Example instance2 = new Example(8);  // 두 번째 인스턴스 생성

        instance1.printVariables();  // 각 인스턴스의 변수 출력
        instance2.printVariables();
    }
}






/*
 
멤버 변수 (Member Variable):
멤버 변수는 클래스 내부에서 선언된 변수로, 해당 클래스의 모든 인스턴스에서 공유됩니다.
클래스 내부에서 선언되었지만 static 키워드가 사용되지 않았습니다.
각 객체(인스턴스)가 가지는 데이터를 나타냅니다.


클래스 변수 (Class Variable 또는 Static Variable):
클래스 변수는 static 키워드로 선언된 변수로, 해당 클래스의 모든 인스턴스가 공유합니다.
클래스 변수는 모든 인스턴스에서 동일한 값을 유지하며, 한 번 변경되면 모든 인스턴스에 반영됩니다.
 
 
인스턴스 변수 (Instance Variable):
인스턴스 변수는 클래스 내부에서 선언되었지만 static 키워드가 없는 변수로, 각 인스턴스마다 별도로 유지됩니다.
각 객체(인스턴스)가 가지는 고유한 데이터를 나타냅니다.

 */
