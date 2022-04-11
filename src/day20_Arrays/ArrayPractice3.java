package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();// suppose 10 = this number is length of the array
        if(length <= 0){
            System.err.println("Invalid Entry");
            System.exit(0);
        }


        int[] numbers = new int[length];// we allowed the user to decide the length of the array by asking the question above
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();//each input user provided during each execution of the loop will be assigned to the indexes of the array
        }


        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
