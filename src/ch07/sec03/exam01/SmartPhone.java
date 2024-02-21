package ch07.sec03.exam01;

public class SmartPhone extends Phone {
    public SmartPhone(String model, String color) {
        //부모 객체의 생성자를 먼저 실행해준다(부모 생성자의 매개변수가 없다면 생략가능!): 생략하면 컴파일시 자동 추가됨
        //부모 생성자의 매개변수가 있다면 생략 불가X
        super(model, color);

        System.out.println("SmartPhone(String model, String color) 생성자 실행"); // 자식 객체 생성자
    }
}
