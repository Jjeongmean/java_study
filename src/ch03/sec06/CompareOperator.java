package ch03.sec06;

public class CompareOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1 );
        System.out.println("result2: " + result2 );
        System.out.println("result3: " + result3 );

        char char1 = 'A'; // 65
        char char2 = 'B'; // 66
        boolean result4 = (char1 < char2);
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4); // num3는 double타입으로 변환되어 연산됨, double과 double이 만나 실수 계산을 함
        System.out.println("result:5 " + result5);


        // float와 double 비교 시 주의사항
        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);// 정밀도의 차이로 부동소수점 방식을 사용하는 실수타입은 정확히 표현하지 못함.
        System.out.println("resylt6: " + result6);

        //solution: 강제타입변환을 시켜서 타입을 같게 만든다
        boolean result7 = (num5 == (float) num6); // double타입을 float형으로 강제타입변환시킴
        System.out.println("result7: " + result7);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = str1.equals(str2);
        boolean result9 = !str1.equals(str2);
        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    }
}
