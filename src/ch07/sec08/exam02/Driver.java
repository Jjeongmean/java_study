package ch07.sec08.exam02;

public class Driver {
    //메소드의 매개변수를 통해 자동타입변환이 일어난다
    public void drive(Vehicle vehicle) { // 자동타입변환 / Vehicle vehicle = new Car() 
        vehicle.run(); // 메소드 오버라이딩
    }
}
