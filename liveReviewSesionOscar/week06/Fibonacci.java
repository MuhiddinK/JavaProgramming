package week06;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
        Fibonacci Sequence:
        term number : 0 1 2 3 4 5 6 7
        actual value: 0 1 1 2 3 5 8 13

                    num1 + num2 = sum
        iteration1   0   +   1   = 1
        iteration2   1   +   1   = 2
        iteration3   1   +   2   = 3
        iteration4   2   +   3   = 5
        iteration5   3   +   5   = 8
        iteration6   5   +   8   = 13
        .........
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the term number for fFibonacci series? : ");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;
        int sum ;

        String series = ""+ num1+" "+num2+" ";

        for (int i = 2; i <=6 ; i++) {//i starts from 2 because we already assigned first two number as num1 and num2
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
            series += sum+" ";

        }

        System.out.println("series = " + series);
        System.out.println("final number in the sequence is : " + num2);

        scanner.close();
    }
}
