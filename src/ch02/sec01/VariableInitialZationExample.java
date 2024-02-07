package ch02.sec01;

public class VariableInitialZationExample {
    // main ➡  public static void main(String[] args) {}
    public static void main(String[] args) {
        // 변수 선언(메모리에 값이 할당 되지 않음X)
        int value;

        // 휘발성 : 전원 끄면 데이터가 삭제됨
        value = 20; // 메모리에 값이 할당된다(이제서야 할당됨, 숫자를 대입해야 값이 할당) ex) 100번지에 20 할당

        // 변수 선언과 동시에 메모리 값 할당
        int value2 =10;

        //sout 단축키 사용 ➡ System.out.println()
        // ctrl + d : 줄(라인) 복사
        System.out.println("value 값:" + value); // ctrl + d : 라인복사 / 문자열 연산
        System.out.println("value 값:" + value2);
    }
}
