package ch07.sec07.exam02;

public class Child extends Parent{
    int field2 = 0;
    @Override //method2 오버라이드
    public void method2() {
        System.out.println("Child-method2()");
    }
    public void method3(){
        System.out.println("Child-method3()");
    }
}
