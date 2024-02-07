package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        // long 타입을 쓸 때 int 타입 허용범위에 있는 숫자는 사용가능
        long var1 = 10; //int 타입으로 인식 ➡ int 타입 허용범위 안에 있으면 L을 안붙여도 된다
        long var2 = 20L; // long 타입으로 인식
        long var3 = 100000000000000L; //⭐int 타입으로 인식 ➡int타입 허용 범위를 벗어남 ➡ L을 붙여야 한다
        long var4 = 100000000000000L; //Long 타입으로 인식

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
