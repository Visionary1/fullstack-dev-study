package Day12_08_work;

import Day12_08.dog;

public class AnimalTest {
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[2];

        // up-casting
        animals[0] = new Cat();
        animals[1] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < 3; j++) {
                animals[i].cry();
            }
        }

        // ((Cat) animals[0]).grooming();
        // ((Dog) animals[1]).lash();

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                Cat cat = (Cat) animals[i];
                cat.grooming();
            } else if (animals[i] instanceof Dog) {
                Dog dog = (Dog) animals[i];
                dog.lash();
            }
        }
        


        // 야옹  
        // 야옹  
        // 야옹  
        // 멍멍  
        // 멍멍  
        // 멍멍  
        // 그루밍  
        // 꼬리 흔들흔들  
    }
}
