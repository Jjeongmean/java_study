package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20; // 컴파일 단계에서 연산을 수행하므로 byte result1 = 30;과 같다
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; //int 타입으로 변환 후 연산됨 ➡ int 타입으로 바꿈
        int result3 = (byte) (v1 + v2); // ➡ 강제타입변환을 시킴
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result4 = v3 +v4 + v5; // long 타입으로 변환 후 연산됨 ➡ ⭐값의 허용범위가 큰 타입으로 변환된다
        System.out.println("result4: " + result4);


        float f1 = 1.2f;
        double d1 = 3.4;
        double result5 = f1 + d1; // double 타입으로 변환 후 연산됨 ➡ 실수끼리 연산도 허용범위가 큰 타입으로 변환

        System.out.println("result5: " + result5);

        //실수, 정수
        int v9 = 10;
        
        //자바에서는 실수 리터럴을 double타입으로 인식하므로 4.0은 double타입이다 float타입으로 연산하려면 뒤에 f 붙여야 함
        double result6 = v9 / 4.0; // double타입(실수)으로 변환 후 연산됨
        float result7 = v9 / 4.0f;
        System.out.println("result6: " + result6);

        //char와 int의 연산
        char v6 = 'A'; //65
        char v7 = 1;
        int result8 = v6 + v7; // int 타입으로 변환 후 연산됨
        System.out.println( "result8:  " + result8); //66
        System.out.println( "result:  " + (char)result8); // B

        int x = 1;
        int y = 2;
        
        // ⭐⭐⭐정수 연산의 결과는 항상 정수 ➡ 결과값인 0.5에서 소수점을 버린다 ➡ 0
        double result = x / y; // 0을 double 타입 변수에 저장하므로 0.0이 출력된다.
        System.out.println( "result:  " + result); // 0.0 출력

        //0.5를 얻기위한 방법 1️⃣(0.5 출력하는 방법1: x를 실수로 만듬)
        //double result9 = (double) x / y; //x를 실수로 만듬

        //0.5를 얻기위한 방법 12️⃣(0.5 출력하는 방법2: y를 실수로 만듬)
        //double result9 =  x / (double) y; // y를 실수로 만듬

        //0.5를 얻기위한 방법 3️⃣(0.5 출력하는 방법3: x,y를 실수로 만듬)
        double result9 = (double) x / (double) y; //x,y를 실수로 만듬

        //double result9 = (double) (x / y); // 0.0 출력
        System.out.println( "result9:  " + result9);


    }
}
