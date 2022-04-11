package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(12+1);//13 Addition
        System.out.println("12"+1);//121 concatenation

        System.out.println(110-50);//60 subtraction
        System.out.println(10*5);//50 multiplication


        System.out.println(100/3);//33
        System.out.println(100.0/3);//33.333333
        System.out.println(100/3.0);//33.333333
        System.out.println(100d/3);//33.333333
        System.out.println(100/3d);//33.333333


        int a = 100;
        double b = a/6; //16
        System.out.println(b);//16.0

        double c = a/6d;//16.6666


        System.out.println(c);

        System.out.println(100d);










    }




}

/*
+:Addition
-:Subtract
*:Multiplication
/:Division
                integer / integer = integer
                decimal / integer = decimal
                integer / decimal = decimal
                decimal / decimal = decimal

        in math: 10/4= 2.5
        in java: 10/4= 2 because of integer numbers
                 10.0/4= 2.5
                 10/4.0= 2.5

%:Reminder
 */
