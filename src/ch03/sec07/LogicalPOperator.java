package ch03.sec07;

public class LogicalPOperator {
    public static void main(String[] args) {
        int charCode = 's'; // 자동타입변환: 65

        // 65 ~ 90 (대문자 A~Z 알파벳 유니코드)
        if((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자이구먼");
        }

        // 97 ~ 122 (소문자 a~z 알파벳 유니코드)
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자이구먼");
        }

        if((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9사이의 숫자이구먼");
        }
        //System.out.println((int)'1');

        System.out.println("===========");

        int value = 6;

        if ((value % 2 == 0) | (value % 3 == 0 )) {
            System.out.println("2 또는 3의 배수");
        }
        if ((value % 8 == 0) || (value % 9 == 0 )) {
            System.out.println("8 또는 9의 배수");
        }

    }
}
