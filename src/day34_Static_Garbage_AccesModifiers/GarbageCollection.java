package day34_Static_Garbage_AccesModifiers;

import day30_CustomClassIntro.Dog;
import day32_Constructor_Overloading.Car;

import java.util.ArrayList;
import java.util.Arrays;

/*
Garbage Collection: Collection of unreferenced objects

		unreferenced objects:
			1. null keyword:
					String str = "Java";
					str = null;


			2. creating a new object

					String str = "Java";
					str = "Python";


Garbage Collector: responsible for collecting the unreferenced objects from java heap. and destroys it ( finalize())
 */

public class GarbageCollection {

    public static void main(String[] args) {
        /*
       int n = null;
       String str = null;
        System.out.println( str.toUpperCase() );

         */


        String str = "Wooden Spoon";
        str = null;// str is eligible for garbage collection

        System.out.println(str);

        Car car1 = new Car("Toyota");

        car1=null;

        System.out.println(car1);

        System.out.println("------------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        new Dog();


        System.out.println("------------------------------------------------");


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;
        list1.addAll( Arrays.asList(200,300,400) );

        System.out.println(list1);
        System.out.println(list2);

        System.out.println( list1 == list2 ); // there are TWO reference names and ONLY ONE object! (One room two doors!)

        System.out.println("------------------------------------------------");


    }


}
