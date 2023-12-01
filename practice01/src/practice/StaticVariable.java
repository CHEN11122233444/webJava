package practice;

public class StaticVariable {
    // static 변수
    static int staticVariable = 10;

    // 인스턴스 변수
    int instanceVariable;

    public static void main(String[] args) {
        // static 변수 접근
        System.out.println("Static Variable: " + StaticVariable.staticVariable);

        // 클래스 인스턴스 생성
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();

        // 인스턴스 변수 설정
        obj1.instanceVariable = 5;
        obj2.instanceVariable = 8;

        // 인스턴스 변수 출력
        System.out.println("Instance Variable 1: " + obj1.instanceVariable);
        System.out.println("Instance Variable 2: " + obj2.instanceVariable);
    }
}
