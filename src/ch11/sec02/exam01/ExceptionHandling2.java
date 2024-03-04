package ch11.sec02.exam01;

import ch05.sec04.NullPointer;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }

    public static void printLength(String data) {
        //예외처리 코드 작성
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            //System.out.println(e.getMessage()); //예외가 발생한 '이유'만 리턴
            //System.out.println(e.toString()); //예외의 종류 + 예외가 발생한 이유 리턴
            e.printStackTrace(); //예외의 종류 + 예외가 발생한 이유 + 예외가 발생한 위치
            //System.out.println("에러가 발생했습니다.");
        } finally {
            System.out.println("[마무리 실행]");
        }
    }
}
