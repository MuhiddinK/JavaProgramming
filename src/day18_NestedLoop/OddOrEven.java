package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){//we write "true" to sure execute the loop infinite time...

            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num%2 == 0){
                System.out.println(num + " is even number");
            }else{
                System.out.println(num+" is odd number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while ( !(a.equals("yes") || a.equals("no"))){//if the answer is not yes or no
                System.err.println("PLEASE RE-ENTER, WOULD YOU LIKE TO ENTER ANOTHER NUMBER?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                break;
            }



        }
        scan.close();
    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enteres invalid answer, repeat the previous steps

 */