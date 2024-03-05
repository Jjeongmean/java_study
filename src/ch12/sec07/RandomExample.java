package ch12.sec07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //Random 클래스를 이용한 로또 당첨

        // 1. 번호 자동 선택
        int[] selectNumber = new int[6]; // 선택번호 6개가 저장될 배열(배열 크기 정의), 로또 번호를 입력받을 배열을 선언해준다
        Random random = new Random(3); //랜덤 객체를 생성하여 랜덤변수를 사용한다. seed를 주면 고정된 난수를 만들어준다.
        System.out.print("선택번호: "); //print 줄바꿈 없음


        //for문 돌려서 1 ~ 45번의 랜덤숫자 추출
        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1; //1 ~ 45까지의 숫자
            System.out.print(selectNumber[i] + " ");
        }

        System.out.println();

        // 2. 당첨 번호 만들기
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.print("당첨번호: ");

        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1; //1 ~ 45까지의 숫자s
            System.out.print(winningNumber[i] + " ");
        }

        // 3. 당첨 여부 알려주기
        Arrays.sort(selectNumber); //비교하기 전에 배열 값을 정렬
        Arrays.sort(winningNumber);

        System.out.println();
        System.out.println("정렬 후 배열");
        System.out.println(Arrays.toString(selectNumber));
        System.out.println(Arrays.toString(winningNumber));

        boolean result = Arrays.equals(selectNumber, winningNumber); //배열 값을 비교

        System.out.print("당첨여부: ");
        if (result) System.out.println("1등 당첨!!!!!!!!");
        else System.out.println("아쉽지만 당첨되지 않았습니다. 다음 기회에...😭");
    }
}
