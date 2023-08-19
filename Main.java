class Main{
  public static void main(String[] args) {
    Spoot spoot1 = new Spoot("Milo", "Black", 123.45, 100, "Devious");
    Spoot spoot2 = new Spoot("Zoey", "Grey", 100.1, 150, "Friendly");
    Spoot spoot3 = new Spoot("Tigger", "Orange", 150.5, 200, "Supportive");

    spoot1.details();
    spoot2.details();
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
  }
  
  void details(){
    System.out.println("My name is " + name + ". I am " + age + " years old." + 
                       " I am " + color + " and I weigh " + weight + " lbs.");
  }
}