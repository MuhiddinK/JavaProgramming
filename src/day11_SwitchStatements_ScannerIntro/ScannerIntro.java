package day11_SwitchStatements_ScannerIntro;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int num1 = input.nextInt();

        System.out.println("Enter a decimal: ");

        double num2 = input.nextDouble();

        //System.out.println(input.nextInt());

        System.out.println(num1);// num1==input.nextInt()
        System.out.println(num2);
        System.out.println("Multiplivation: "+ (num1*num2));

        input.close();//closes the scanner otherwise it will continue to use our memories!!!

        System.out.println("Enter a decimal: ");

        double num3 = input.nextDouble();

/*
Exception in thread "main" java.lang.IllegalStateException: Scanner closed
	at java.base/java.util.Scanner.ensureOpen(Scanner.java:1150)
	at java.base/java.util.Scanner.next(Scanner.java:1573)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at day11_SwitchStatements_ScannerIntro.ScannerIntro.main(ScannerIntro.java:29)

 */



    }
}
