package ch02.plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nextLine() 입력: ");
        String inputNextLine = scanner.nextLine();
        System.out.println(inputNextLine);

        System.out.print("next() 입력: ");
        String inputNext = scanner.next();
        System.out.println(inputNext);

        System.out.print("int형 입력: ");
        int inputint = scanner.nextInt(); // int 타입으로 값을 입력받음
        System.out.println(inputint);

        System.out.print("double형 입력");
        double inputDouble = scanner.nextDouble(); //Double 타입으로 값을 입력받음
        System.out.println(inputDouble);
        System.out.print("int + double" + (inputint + inputDouble));

        System.out.print("boolean형 입력: ");
        Boolean inputBoolean = scanner.nextBoolean(); // boolean 타입으로 입력받음
        System.out.println(inputBoolean);
    }
}
