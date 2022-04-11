package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", "small", "gray", 'M', 2);

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();


        System.out.println(dog);

        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Fish fish = new Fish();


    }









}
