package ch13.sec05;

public class Course {
    /*
     <?> : Unbounded Wildcarsa (제한없음)
     타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있다
     */
    // 모든 사람이 수강신청 가능
    public static void registerCourse1(Applicant<?> applicant) {
        //클래스 이름 출력
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 course1 등록");
    }

    //학생만 수강신청 가능
    //Student클래스와 Student클래스의 하위 클래스만 타입으로 올 수 있다.

    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 course2 등록");

    }

    //직장인 및 일반인만 수강신청 가능
    //Worker클래승와 Worker클래스의 부모 클래스만 타입으로 올 수 있다.
    public static void registerCourse3(Applicant<? super Worker>  applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "가 course3 등록");

    }
}
