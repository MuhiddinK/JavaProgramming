package day08_IfStatement;

public class SingleIfStatementInfo {

    public static void main(String[] args) {

        int number = 301;

        /*
        System.out.println("Odd Number");

        System.out.println("Even Number");*/

        boolean evenNumber = number%2 == 0;
        // boolean oddNumber = number%2 != 0;
        // OR :
        boolean oddNumber = ! evenNumber;



        if(evenNumber) {
            System.out.println(number+" is even number.");
        }

        if (oddNumber) {// not even number

            System.out.println(number+ " is odd number.");

        }

        System.out.println("--------------------------------------");

        int n = 200;

        // Positive
        if(n > 0) {
            System.out.println(n+ " is positive.");
        }

        // Negative
        if(n < 0) {
            System.out.println(n+ " is negative.");
        }

        // zero
        if(n == 0) {
            System.out.println(n+" is zero.");
        }
    }

}
