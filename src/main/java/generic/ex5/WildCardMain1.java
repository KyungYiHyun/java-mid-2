package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.setValue(new Dog("멍멍이",100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildcardV1(dogBox);


        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildcardV2(dogBox);


        Dog dog = WildCardEx.printAndReturn(dogBox);
        catBox.setValue(new Cat("냐옹이",200));
        Cat cat = WildCardEx.printAndReturn(catBox);
        Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
        System.out.println("dog = " + dog);
        System.out.println("animal = " + animal);
    }
}
