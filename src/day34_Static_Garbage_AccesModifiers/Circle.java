package day34_Static_Garbage_AccesModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    // ex
    public static ArrayList<Integer> numbers = new ArrayList<>();
    // numbers.add(10);

    //public static Sheet sheet; to write an excell sheet; it requares several steps


    public Circle(double radius){ // constructors are ONLY for INSTANCES not for the STATICS
        this.radius = radius;
        // pi = 3.14; // this will be repeted and consume more memory
    }

    static { // to set static variables !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       // radius = 5; // do not accept instance
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }

}
