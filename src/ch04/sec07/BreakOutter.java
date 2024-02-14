package ch04.sec07;

public class BreakOutter {
    public static void main(String[] args) {
        //label의 이름은 직접 직기
        //완전히 중단하고 싶은 외비ㅜ 반복문 앞에 label을 지정
        Outter: for (char upper = 'A'; upper <='Z' ; upper++) {
            for (char lower = 'a'; lower <='z' ; lower++) {
                System.out.println(upper + "_" + lower);

                //소문자가 g일때 프로그램 끝내기
                if (lower == 'g') break Outter;

            }

        }
    }
}
