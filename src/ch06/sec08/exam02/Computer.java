package ch06.sec08.exam02;

public class Computer {
    int sum (int ... values) {
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            System.out.println("[" + i + "]: " + values[i]) ;
            sum += values[i]; // values 다 더한 값
        }
        return sum;
    }
}
