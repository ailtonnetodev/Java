import Animals.Bird;
import Animals.Cat;
import Animals.Dog;

import static Animals.Dog.getNumberOfDogs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("bobby", "orange", 56, 22.3, "kidness");

        Cat cat1 = new Cat("frajola", "black", 16, 9.6);

        Bird bird1 = new Bird("Jade", "blue", 13, 1.8);

        dog1.sound();
        cat1.sound();
        bird1.sound();

    }
}