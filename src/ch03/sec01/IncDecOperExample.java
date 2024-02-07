package ch03.sec01;

public class IncDecOperExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        // 값 자체는 전위, 후위든 증가와 감소를 한다.
        x++;
        System.out.println("x=" + x);
        ++x;
        System.out.println("x=" + x);

        y--;
        System.out.println("y=" + y);
        --y;
        System.out.println("y=" + y);

        System.out.println("===========");

        // 선대입 후증가
        z = x++;
        System.out.println("z=" + z); // 12
        System.out.println("z=" + x); // 13

        z = ++x;
        System.out.println("z=" + z); //14
        System.out.println("z=" + x); //14

        z = ++x + y++; // 15 + 8

        System.out.println("z=" +z); //23
        System.out.println("z=" +x); //14+ ➡ 15
        System.out.println("z=" +y); //8+ ➡ 9
    }
}
