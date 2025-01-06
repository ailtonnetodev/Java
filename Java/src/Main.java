import Animals.Dog;

import static Animals.Dog.getNumberOfDogs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("rex", "black", 42, 22.3, "kidness");

        System.out.println(dog1.getNumberOfDogs());

        Dog dog2 = new Dog("boby", "orange", 16, 9.6, "");

        System.out.println(dog2.getNumberOfDogs());
        System.out.println(dog1.getNumberOfDogs());

    }
}