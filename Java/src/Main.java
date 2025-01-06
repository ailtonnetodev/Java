import Animals.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("rex", "black", 42, 16.3, "kidness");
        Dog dog2 = new Dog();

        dog2.setName("boby");
        dog2.setColor("orange");
        dog2.setHeight(30);
        dog2.setWeight(6.9);

        System.out.println(dog1.getSome());
        System.out.println(dog1.bark());


        System.out.println("the dog is " + dog2.interact("kidness"));
        System.out.println("the dog is " + dog2.interact("kick"));
        System.out.println("the dog is " + dog2.interact(""));

        System.out.println(dog2.getName());
    }
}