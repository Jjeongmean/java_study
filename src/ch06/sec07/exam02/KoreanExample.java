package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        // 객체가 생성이 될때 생성자가 실행이 되고 필드에 값이 할당된다
        Korean k1 = new Korean("이석민", "970218-1234567"); //첫번째 사람 생성
        System.out.println("이석민의 nation: " + k1.nation);
        System.out.println("이석민의 name: " + k1.name);
        System.out.println("이석민의 ssn: " + k1.ssn);
        System.out.println("--------------------------");

        Korean k2 = new Korean("권순영", "960615-1010214"); //두번째 사람 생성
        System.out.println("권순영의 nation: " + k2.nation);
        System.out.println("권순영의 name: " + k2.name);
        System.out.println("권순영의 ssn: " + k2.ssn);
        System.out.println("--------------------------");

    }
}
