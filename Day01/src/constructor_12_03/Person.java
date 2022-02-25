package constructor_12_03;

public class Person {

    // private => hiding 은닉화
    private String name;
    private String birth;
    private String Gender;

    // Constructor => automatically initiated when an instance is created
    // no return type
    // public Person() {
    //     System.out.println("init");
    // }

    // Overloading => 같은 메소드 중 파라미터의 타입이 다르거나, 인풋이 다르면 
    public Person(String name, String birth, String gender) {
        this.name = name;
        this.birth = birth;
        this.Gender = gender;
        //System.out.println("overloading");

    }

    // this is method, not constructor
    // public void Person() {
        
    // }


    // method, en-capsulating => getter, setter

    // get
    public String getName() {
        return this.name;
    }

    public String getBirth() {
        return this.birth;
    }

    public String getGender() {
        return this.Gender;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }


    public void hello() {
        System.out.println("Hello");
    }

    public void walk() {
        System.out.println("walk");
    }

    public void introduce() {
        System.out.println("my name is " + this.name + " and I'm " + Gender);
    }

    public void age() {
        int age = 2022 - Integer.valueOf(this.birth.substring(0, 4));
        System.out.println("My age is " + age);
    }
}

