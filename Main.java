//Program Name: Spoot Creation
//Author: Gavin Schnepper
//Created: August 15th, 2023
//
//Description: This is a project that contains a class with a
//constructor and method to create a "Spoot" object and provide the
//user with the details that apply to each of the objects.
//When the project is loaded up information will be displayed relating
//to the creation of a Spoot. It will provide the name, weight, age,
//color and ability that each of the objects "Spoots" hold. A setter
//method will be used which takes input from the user to change the
//name of the Spoot and then a getter method can be used to verify that
//the name provided has updated properly and maintains its new
//description.
//
//
//Modified: August 18th, 2023

//Import scanner utility
import java.util.Scanner;

class Main{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //Lines 9, 10, and 11 contain the Objects that we are looking to
    //create and potentially modify in the future. spoot1, spoot2 and
    //spoot3 all contain details that will define the object and make
    //use of the constructor in the Spoot class.
    Spoot spoot1 = new Spoot("Milo", "Black", 123.45, 100, "Devious");
    Spoot spoot2 = new Spoot("Zoey", "Grey", 100.1, 150, "Friendly");
    Spoot spoot3 = new Spoot("Tigger", "Orange", 150.5, 200, "Supportive");

    //We can call the details method to display to the user what each 
    //aspect of the object is (name, age, weight etc.)
    spoot1.details();
    spoot2.details();
    spoot3.details();

    //The user will be prompted to Re-Name the Spoot in order to make
    //use of getter and setter methods which will set the user provided
    //name as the new official name of the spoot. The getter method
    //confirms that the name has been changed after the input and sends
    //it back to the user.
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

//This is the Spoot class which serves to be the blueprint for the Spoot
//objects which contains the name, color, weight, age, and ability variables.
class Spoot{
  String name;
  String color;
  double weight;
  int age;
  String ability;

  //The Spoot constructor will make use of each of the variables outlined
  //in the class to create the objects.
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

  //This setName method will grab the givenName variable from the user
  //and set this name to be the new official name of the object.
  public void setName(String givenName){
    this.name = givenName;
  }

  //The getName method will be used to retrieve the name at any point it is needed
  //to verify that the name is accurate and up to date.
  public void getName(){
    System.out.println("This spoot has been Re-Named to " + name);
  }
}
