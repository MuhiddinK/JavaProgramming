package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;//this is the smallest int number

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();//1

            if(num > max){//if the user entered number is greater than current max number
                max = num;
            }

        }

        System.out.println("max = " + max);

        scan.close();
    }

}
/*
Write a program and ask users to enter a number for 5 times, return the max number
 */