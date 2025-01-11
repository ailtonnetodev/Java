package Animals;

public class Cat extends Animal {

    static int numberOfCats;

    public Cat(String name, String color, int height, double weight) {
        super(name, color, height, weight);
    }

    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
