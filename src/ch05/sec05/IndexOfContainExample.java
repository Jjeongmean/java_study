package ch05.sec05;

public class IndexOfContainExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍"); //인덱스 번호 int형
        System.out.println(location);

        //subject에서 프로그래밍으로 시작하는 글자 추출하기
        String substring = subject.substring(3); //인덱스 번호 3번부터 문자열 끝까지의 글자 추출
        System.out.println(substring);

        //문자열에서 '자바'라고 하는 글자 있는지 확인
        location = subject.indexOf("자바");
        System.out.println(location); //0 출력

        // indexOf는 찾는 글자가 없으면 무조건 -1를 준다
        if (location == -1) System.out.println("'자바'라고 하는 글자가 없습니다.");
        else System.out.println("'자바'라고 하는 글자가 있습니다");

        //해당 글자를 포함하는지 true 혹은 false로 값을 준다.
        boolean result = subject.contains("자바"); //boolean타입
        if (result) System.out.println("'자바'라고 하는 글자가 있습니다.");
        else System.out.println("'자바'라고 하는 글자가 없습니다.");
    }
}
