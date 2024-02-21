package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        //SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로부터 상속받은 필드 사용가능
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        //SmartPhone 클래스의 필드 읽기
        System.out.println("와이파이 상태: " + myPhone.wifi); // 자식 클래스에 있는 public boolean wifi;

        // Phone으로부터 상속받은 메소드 사용 가능
        myPhone.bell();
        myPhone.sendVoice("여보세요?");
        myPhone.receiveVoice("쎄더넴 세븐틴! 안녕하세요 세븐틴입니닷");
        myPhone.sendVoice("와 신방뿡방!");
        myPhone.hangUp();


        //smartPhone의 메소드 사용
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
