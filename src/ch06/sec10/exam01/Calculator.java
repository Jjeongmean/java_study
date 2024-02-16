package ch06.sec10.exam01;

public class Calculator {
    static double pi = 3.14159; // 정적 필드("static"이 붙은 필드는 정적필드)

    static int plus(int x, int y) { // 정적 메소드 ("static"이 붙은 메소드는 정적메소드)
        return x + y;
    }

    static int minus(int x, int y) { // 정적 메소드 ("static"이 붙은 메소드는 정적메소드)
        return x - y;
    }
}
