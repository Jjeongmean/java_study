package ch08.sec02;

public class RemotoControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television(); //자동타입변환, 오버라이드된 자식 객체 불러옴
        rc.turnOn();

        RemoteControl rc2 = new Audio();
        rc2.turnOn();

        System.out.println("리모컨 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모컨 최소 볼륨: " + RemoteControl.MIN_VOLUME);
    }
}
