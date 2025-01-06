import Animals.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.setName("boby");
        dog1.setColor("orange");
        dog1.setHeight(30);
        dog1.setWeight(6.9);

        System.out.println(dog1.getSome());
        System.out.println(dog1.bark());

        System.out.println("the dog is " + dog1.interact("kidness"));
        System.out.println("the dog is " + dog1.interact("kick"));
        System.out.println("the dog is " + dog1.interact(""));
    }
}