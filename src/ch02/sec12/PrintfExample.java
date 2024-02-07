package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        // print (줄바꿈 없음, 한줄로 출력)
        //System.out.print("안녕하세요. ");
        //System.out.print("자바입니다. ");

        // \n : 줄바꿈
        // 1$ , 2$ , 3$ : 순서 차례대로 출력
        //System.out.printf("이름: %1$s, 나이: %3$d, 일자: %2$d일", "이지은", 30, 16); //이름: 이지은, 나이: 30
        //System.out.printf("나이: %d", 30);
        int value = 123;
        System.out.printf("상품의 가격: %d\n", value); // 정수
        System.out.printf("상품의 가격: %6d\n", value); // ___123 정수 6자리, 왼쪽 공백 ,6번째짜리 정수 만듬 없는 자리의 숫자들을 공백처리
        //System.out.printf("상품의 가격: %-6d\n", value); // 123___ 정수 6자리, 오른쪽 공백
        System.out.printf("상품의 가격: %06d\n", value); // 정수 6자리, 왼쪽 빈자리 0 으로 채움

        double area = 3.14159 * 10 * 10;
        // 정수 7자리 + 소수점 + 소수2번째자리 = 총 10자리, 왼쪽 공백에 공백 생김
        System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
        
        // 정수 7자리 + 소수점 + 소수2번째자리 = 총 10자리, 오른쪽에 공백 생긴다
        System.out.printf("반지름이 %d인 원의 넓이:%-10.2f\n", 10, area);
        
        // 정수 7자리 + 소수점 + 소수2번째자리 = 총 10자리, 왼쪽 공백을 0으로 채운다
        System.out.printf("반지름이 %d인 원의 넓이:%010.2f\n", 10, area);

        String name = "세븐틴";
        String job = "가수";

        // %6s : 6자리 문자열, 왼쪽 빈자리에 공백 
        // %-6s : 6자리 문자열, 오른쪽 빈자리에 공백
        System.out.printf("%6s|%-6s", name, job);
    }
}
