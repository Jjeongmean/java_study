package ch04.sec04;

public class Multiplication {
    public static void main(String[] args) {
        for (int m = 2; m <= 9 ; m++) { //2부터 9까지 하나씩 증가
            System.out.println("***" + m + "단 ***");
            for (int n = 1; n <=9 ; n++) { // m x n(1부터 9까지 하나씩 증가)
                System.out.println(m + "x" + n + "=" +(m * n));

            }

        }
    }
}
