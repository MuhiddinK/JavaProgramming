package day12_Scanner;

import java.util.Scanner;// regular import: imports only what we need if efficiently important
//import java.util.*; = wild import: imports everything from the util package! it takes much more memory!

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//assign an scanner variable
        System.out.println("Enter a number between 1 to 7: ");
        int num = scan.nextInt();// scan.nextInt();//it is now waiting to enter intiger number

        String result = "";//temporary value

        if(num >= 1 && num <= 7){// 7 conditions Have to be used
            result= (num==1)?"Monday" :(num==2)?"Tuesday" :(num==3)?"Wednesday" :(num==4)?"Thursday" :(num==5)?"Friday" :(num==6)?"Saturday" : "Sunday";


        }else{
            result = "Invalid Number";
        }


        System.out.println(result);

        scan.close();// It is preferred to close scanner when we have done with

    }
}
