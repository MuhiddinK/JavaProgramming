package day37_Inheritance.animalTask;

public class Dog extends Animal {

   // public int a; // assume Dog has one more extra instance variable

   public Dog(String name, String breed, char gender, int age, String size, String color){// int a has to be added in paranthesses
      super(name,breed,gender, age, size, color);
      //this.a = a; // to set extra instance variable
   }

   public void bark(){
      System.out.println(name+" is barking");
   }



}
