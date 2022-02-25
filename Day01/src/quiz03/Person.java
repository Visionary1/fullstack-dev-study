package quiz03;

public class Person {
    String name;
    String birth;
    String sex;

    public void hello() {
        System.out.println("Hello");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void introduce() {
        System.out.println("my name is " + this.name + " and I'm " + sex);
    }

    public void age() {
        int age = 2022 - Integer.valueOf(this.birth.substring(0, 4));
        System.out.println("My age is " + age);
    }
}
