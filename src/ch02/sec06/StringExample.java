package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        char var1 = 'A'; // char타입은 큰따옴표("") 사용할수 X ➡ 작은따옴표로 바꿔져야함('')
        String var2 = "홍길동"; // char타입은 문자를 1개 밖에 못씀 ➡ 이럴경우에 사용하는 것이 String


        String name = "홍길동";
        String job = "프로게이머";

        System.out.println(name + "은 " + job + "입니다.");

        //쌍따옴표 출력 \" or \'
        String str = "나는 \'자바\' 를 배웁니다";
        System.out.println(str);

        // tab 만큼 띄어쓰기 ➡ \t
        str = "번호\t이름\t직업";
        System.out.println(str);

        // 줄바꿈 ➡ \n
        System.out.println("나는\n자바를\n배웁니다");
    }
}
