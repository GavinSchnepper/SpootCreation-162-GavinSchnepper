import java.util.Scanner;

class Main{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Spoot spoot1 = new Spoot("Milo", "Black", 123.45, 100, "Devious");
    Spoot spoot2 = new Spoot("Zoey", "Grey", 100.1, 150, "Friendly");
    Spoot spoot3 = new Spoot("Tigger", "Orange", 150.5, 200, "Supportive");

    spoot1.details();
    spoot2.details();
    spoot3.details();
    
    System.out.println("Re-Name the first Spoot!");
    String givenName1 = input.nextLine();
    spoot1.setName(givenName1);
    spoot1.getName();
    spoot1.details();

    System.out.println("Re-Name the second Spoot!");
    String givenName2 = input.nextLine();
    spoot2.setName(givenName2);
    spoot2.getName();
    spoot2.details();

    System.out.println("Re-Name the third Spoot!");
    String givenName3 = input.nextLine();
    spoot3.setName(givenName3);
    spoot3.getName();
    spoot3.details();
  }
}

class Spoot{
  String name;
  String color;
  double weight;
  int age;
  String ability;

  Spoot(String spootName, String spootColor, double spootWeight, int spootAge, 
        String spootAbility){
    System.out.println(spootName + " the " + spootAbility + " now exists.");
    name = spootName;
    color = spootColor;
    weight = spootWeight;
    age = spootAge;
    ability = spootAbility;
  }
  
  public void details(){
    System.out.println("My name is " + name + ". I am " + age + " years old." + 
                       " I am " + color + " and I weigh " + weight + " lbs.");
  }
  public void setName(String givenName){
    this.name = givenName;
  }
  public void getName(){
    System.out.println("This spoot has been Re-Named to " + name);
  }
}
