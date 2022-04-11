package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; // Auto Boxing (implicitly)

        //Long n1 = num1; int CANNOT be converted into any Wrappers object, but the Integer object !

        int num2 = n1; // Un Boxing (implicitly)

        System.out.println("-------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue; // as long as within the range Wrapper objects can be converted into any Primitive

        Byte b1 = 25;

        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;


        System.out.println("--------------------------------------");

        Integer z = 900;

        Integer y = z;



        System.out.println("--------------------------------------");


        int[] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};

        System.out.println("--------------------------------------");





    }

}
