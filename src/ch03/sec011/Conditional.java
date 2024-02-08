package ch03.sec011;

public class Conditional {
    public static void main(String[] args) {
        //점수로 A,B,C 3가지의 등급을 저장
        int score = 85;
        //삼항연산자 중첩(조건이 3개 이상일때)
        //js 조건식과 비슷함
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다");
        
    }
}
