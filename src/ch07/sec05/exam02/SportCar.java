package ch07.sec05.exam02;

public class SportCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    // final 메소드는 자식클래스에서 재정의(오버라이딩) 할수 없다
//    @Override // 오류 발생
//    public void stop() {
//        System.out.println("차를 멈춤");
//        speed = 0;
//    }
}
