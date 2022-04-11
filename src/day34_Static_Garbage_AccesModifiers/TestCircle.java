package day34_Static_Garbage_AccesModifiers;

import static day34_Static_Garbage_AccesModifiers.Circle.*;//imports all of the static members

import static utilities.MathUtility.*;

public class TestCircle {

    public static void main(String[] args) {

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);


        System.out.println("--------------------------------------");

        //sum of 10 and 20
        int r1 = sum(10,20);

        //sum of 100 and 200
        int r2 = sum(100, 200);

        int r3 = subtract(100, 50);

        max(1000, 2000);






    }


}
