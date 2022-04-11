package day12_Scanner;

import java.util.Scanner;

public class Circle_NextDouble {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double r = input.nextDouble();//user will enter the value of 'r'

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println(area);


        input.close();
    }
}
