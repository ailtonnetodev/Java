import Animals.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Boby";
        dog1.color = "orange";
        dog1.height = 14;
        dog1.weight = 5.6;

        System.out.println(dog1);
    }
}