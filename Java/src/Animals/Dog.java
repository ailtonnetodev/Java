package Animals;

public class Dog {
   public String name;
   public String color;
   public int height;
   public double weight;
   public String stateOfMind;

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
