package ch07.sec04.exam02;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC; //클래스명으로 접근가능
        sa.fly();

        sa.flyMode = SupersonicAirplane.NORMAL; //클래스명으로 접근가능
        sa.fly();
    }

}
