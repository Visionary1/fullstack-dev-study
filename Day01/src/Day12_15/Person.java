package Day12_15;

public class Person {
    private String name;
    private String birth;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return this.birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", birth: " + this.birth;
    }
}
