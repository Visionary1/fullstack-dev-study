package Day12_08;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = (Animal) new Cat(); // up-casting, can be omitted
        // Animal animal = new Cat();

        /*
        1. can use parent's methods
        2. can override parent's methods and use it
        3. cannot use methods that are in child class
        */

        int number = (int) 1.5; // casting

        animal.cry();
        animal.eat();
        // animal.grooming(); // doens't work

        // down-casting
        /*
        1. have to specify casting type since there are many child classes
        2. 
        */
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.cry();
            cat.eat();
            cat.grooming();
        } else if (animal instanceof dog) {
            dog dog = (dog) animal;
            dog.cry();
            dog.eat();
            dog.lash();
        }

        // won't work 
        // dog dog = (dog) animal;
        // dog.cry();
        // dog.eat();
        // dog.lash();
        

    }
}
