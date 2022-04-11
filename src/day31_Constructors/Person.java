package day31_Constructors;

public class Person {


    public String name;
    public char gender;
    public int age;


    // this is the constructor
    public Person(String name, char gender, int age){
        this.name = name; // assign the instance variable as the given argument
        this.gender = gender;
        this.age = age;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }



}
