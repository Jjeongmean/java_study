package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        //A 객체 생성(먼저 외부 클래스를 인스턴스화 해준다)
        A a = new A();

        //B 객체 생성(외부클래스.내부클래스 형식으로 내부클래스를 초기화 하여 사용할 수도 있다)
        //A 객체를 생성해야 B객체를 생성할 수 있음
        A.B b = a.new B();
    }
}
