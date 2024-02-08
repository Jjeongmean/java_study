package ch03.sec010;

public class AssignOperator {
    public static void main(String[] args) {
        int result = 0;

        result += 10; // result = result + 10;
        System.out.println(result); //10 = 0+10

        result -= 5; // result = result - 5;
        System.out.println(result); //5 = 10-5

        result *= 3; // result = result * 3;
        System.out.println(result); //15 = 5*3
    }
}
