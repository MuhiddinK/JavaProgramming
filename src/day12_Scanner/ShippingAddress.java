package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String buildingNumber = scan.next();

        scan.nextLine();
        System.out.println("enter street name");
        String streetName = scan.nextLine();

        System.out.println("enter city name");
        String city = scan.nextLine();

        System.out.println("enter state name");
        String state = scan.next();

        System.out.println("enter zip code: ");
        String zipCode = scan.next();

        scan.nextLine();
        System.out.println("enter country name");
        String country = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);


        scan.close();
    }
}
/*
1. full name- nextLine()
2. building number - next()
    // before using nextLine() we have to add one more nextLine() method
3. street name - nextLine()
4. city name _ nextLine()
5. state - next()
6. zip code _ next()
 */