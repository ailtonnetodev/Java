package Animals;

public class Animal {

    static int numberOfAnimals;
    protected String name;
    protected String color;
    protected int height;
    protected double weight;
    protected String stateOfMind;

    public Animal(String name, String color, int height, double weight) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    protected void sound() {}

    protected void getSome() {}

    protected void sleep() {}
}
