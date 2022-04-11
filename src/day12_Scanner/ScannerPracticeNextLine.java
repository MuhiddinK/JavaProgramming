package day12_Scanner;

import java.util.Scanner;

public class ScannerPracticeNextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Enter your programming language: ");
        String programingLanguage = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt();//this method ignore the enter key. So it left "enter"  in scanner and make it full! able to use enter again we first have to clean the memory of the scanner!

        input.nextLine();//after using "input.nextInt();" scanner is full of "enter" key. To make empty our scanner we have to make this method ones more
        // Now our scanner is empty, and we can use enter again!
        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programingLanguage = " + programingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        input.close();

    }
}
