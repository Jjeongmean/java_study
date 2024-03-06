package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.content = "안녕하세요";
        String content = box.content;

        Box<Integer> box2 = new Box<>(); // <> 회색 Integer 생략 가능
        box2.content = 10; //integer를 사용했기에 정수만 가능
        int content2 = box2.content;

        // cf) Box를 생성할때 저장할 내용물의 타입을 미리 알려주면
        // content에 무엇이 대입되고, 읽을 때 어떤 타입으로 제공할지를 안다.


        //box.content = "문자열";
        //box.content = 1; //Integer 타입
        //box.content = new Bottle();

        //String content = (String) box.content;
        //System.out.println(content);
    }
}
