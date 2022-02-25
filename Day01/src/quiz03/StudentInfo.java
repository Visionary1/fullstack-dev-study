package quiz03;


public class StudentInfo {

    // System.out.println(stu1.name);
    // System.out.println(stu1.age);
    // System.out.println(stu1.className);
    // System.out.println(stu1.phoneNumber);
    // stu1.isAdult();

    String name;
    int age;
    String className;
    String phoneNumber;

    boolean isAdult() {
        return this.age >= 20 ? true : false;
    }
    
    public int getColumnCount() {
        return getClass().getDeclaredFields().length;
    }
    

    // public void isVoid() {
    //     System.out.println(this.name + " is " + (this.age >= 20 ? "adult" : "teenager"));
    // }
}
