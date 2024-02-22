package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    public D() {
        super(); // 부모클래스(A)의 생성자를 호출
    }
    public void method1() {
        //상속관계일때 protected 접근 제한자가 있는 필드와 메소드를 사용할 수 있음
        this.field = "value";
        this.method();
    }
    public void method2() {
        // ⭐직접 객체를 생성해서 사용X
//        A a = new A();
//        a.field = "value";
//        a.method();
    }

}
