package Animals;

public class Dog {
   // Attributes
   static int numberOfDogs;
   private String name;
   private String color;
   private int height;
   private double weight;
   private String stateOfMind;


   //builders
   public Dog() {}

   public Dog(String name, String color, int height, double weight, String stateOfMind) {
      this.name = name;
      this.color = color;
      this.height = height;
      this.weight = weight;
      this.stateOfMind = stateOfMind;

      numberOfDogs ++;
   }

   //methods


   public static int getNumberOfDogs() {
      return numberOfDogs;
   }

   public static void setNumberOfDogs(int numberOfDogs) {
      Dog.numberOfDogs = numberOfDogs;
   }

   public String bark() {
      return "woof woof!";
   }

   public String getSome() {
      return "ball";
   }

   public String interact(String action) {
      switch (action) {
         case "kidness": this.stateOfMind = "happy"; break;
         case "kick": this.stateOfMind = "bite"; break;
         default: this.stateOfMind = "neutal"; break;
      }

      return this.stateOfMind;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int height) {
       this.height = height;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   public String getStateOfMind() {
      return stateOfMind;
   }

   public void setStateOfMind(String stateOfMind) {
      this.stateOfMind = stateOfMind;
   }

   @Override
   public String toString() {
      return "Dog{" +
              "name='" + name + '\'' +
              '}';
   }

   //   public String interact(String action) {
//      if (action.equals("kidness")) {
//         this.stateOfMind = "happy";
//      } else if (action.equals("kick")) {
//         this.stateOfMind = "bite";
//      } else {
//         this.stateOfMind = "neutal";
//      }
//
//      return stateOfMind;
//   }

}
