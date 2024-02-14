package ch05.sec07;

public class MultiDimesion {
    public static void main(String[] args) {
        // 2차원 배열 생성: 배열안에 배열이 들어간 형태
        int[][] scores = {
                {99, 95, 97}, // 1반 점수
                {96, 98} // 2반 점수
        };

        //배열의 길이 출력
        System.out.println("학급의 수: " + scores.length);
        System.out.println("1반의 학생 수: " + scores[0].length); //1반의 전체 학생 수
        System.out.println("2반의 학생 수: " + scores[1].length);

        // 1반에서 세번째 학생의 점수 읽기
        System.out.println("1반에서 세번째 학생: " + scores[0][2]); //1반의 세번째
        // 2반에서 두번째 학생의 점수 읽기
        System.out.println("2반에서 두번째 학생: " + scores[1][1]);

        //1반의 평균 점수 구하기 ➡ scores[0](1반)
        int classSum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            classSum += scores[0][i]; // scores[0][0], scores[0][1], scores[0][2]
        }
        double classAvg = (double) classSum / scores[0].length;
        System.out.println("1반의 평균 점수: " + classAvg);

        //2반의 평균 점수 구하기 ➡ scores[1](2반)
        int class2Sum = 0;

        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i]; //scores[1],[0], scores[1],[1]
        }

        double class2Avg = (double) class2Sum /scores[1].length;
        System.out.println("2반의 평균 점수: " + class2Avg
        );

        //전체 학생의 평균 구하기
        //2차원 배열의 전체 데이터를 한꺼번에 출력할시 ➡ 중첩 for문을 사용합니다
        int totalStudent = 0; //전체 학생수
        int totalSum = 0; // 전체 학생의 점수 합계

        for (int i = 0; i < scores.length; i++) { //반의 갯수 만큼 반복
            totalStudent += scores[i].length; // 1반, 2반의 전체 학생수를 더한다

            for (int j = 0; j < scores[i].length ; j++) { // 해당 반의 학생 수 만큼 반복
                totalSum += scores[i][j]; // 학생 점수 합산 

            }
        }

        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);




    }
}