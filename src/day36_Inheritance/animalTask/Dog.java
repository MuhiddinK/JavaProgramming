package day36_Inheritance.animalTask;

public class Dog extends Animal{// Dog Is An animal
    //      child        parent

    public void bark(){
        System.out.println(name+ " is barking.");
    }



}
/*
Task:

	Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()


	Dog extends Animal:
			bark()

	Cat extends Animal:
			scratch()

	Tiger extends Animal:
			roar()

	Fish extends Animal:
			swim()

	...

 */