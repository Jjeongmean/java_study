package ch06.sec11.exam01;

public class Korean {
    // 상수 필드 선언
    final String nation = "대한민국"; // 첫번째, 상수 필드 초기와 방법
    final String ssn;

    //인스턴스 필드
    String name;
    //두번째 상수 필드 초기화 방법

    public Korean(String ssn, String name) {
        this.ssn = ssn; //매개변수 명과 필드명의 이름이 같을때 초기값을 주어야 할때 this사용
        this.name = name;
    }

}
