package ch12.sec07;

public class MathExample {
    public static void main(String[] args) {
        // Math.ceil(numver):number
        //인수의 소수점 이하를 올림한 정수를 반환한다.
        double v1 = Math.ceil(5.3); //(천장으로) 올림
        double v2 = Math.floor(5.3); //(바닥으로) 내림
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        long v3 = Math.max(3, 7);
        long v4 = Math.min(3, 7);
        System.out.println("v3: " + v3); //
        System.out.println("v4: " + v4);

        //소수 이후 두 자리 얻기
        double value = 12.3456; //1234.56
        double temp1 = value * 100; //1235
        long temp2 = Math.round(temp1);

        System.out.println(temp2); //1235 출력

        double v5 = temp2 / 100.0;
        System.out.println(v5); // 12.35
    }
}
