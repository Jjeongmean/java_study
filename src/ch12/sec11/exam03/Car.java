package ch12.sec11.exam03;

public class Car {
    public static void main(String[] args) {
    Class clazz = Car.class;

    String photoPath = clazz.getResource("photo1.jpg").getPath();
    System.out.println(photoPath);

    String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
    System.out.println(photo2Path);

    }
}
