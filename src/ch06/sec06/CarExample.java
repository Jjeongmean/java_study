package ch06.sec06;

public class CarExample {
    public static void main(String[] args) {
        //설계도(class)를 바탕으로 자동차를 생산한다

        // 첫번째 자동차 생산
        Car myCar = new Car(); // 자동차 한 대 생산

        // 필드 값 가져오기
        // 전 클래스에서 속성 추가해주기
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
        System.out.println("제작회사: " + myCar.company);
        System.out.println("최고속도: " + myCar.maxSpeed);

        //필드 값 변경
        myCar.speed = 60;
        myCar.start = false;

        System.out.println("현재속도: " + myCar.speed);
        System.out.println("시동여부: " + myCar.start);

        //메소드(기능) 실행
        myCar.run();
        myCar.stop();


    }
}
