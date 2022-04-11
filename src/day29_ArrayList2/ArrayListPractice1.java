package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //converting non-Primitive Array to ArrayList :
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries) );

        list.removeIf( p-> p.length() >= 10 );


        // converting ArrayList to Array
        countries = list.toArray(new String[0]); // we have to write the size of the Array at the beginning, so we declare as 0(zero) at the beginning

        System.out.println(Arrays.toString(countries) );



    }
}
/*
1. Create an Array of String called countries
2. Write a program tht can remove all the country names that have length of 10 or greater
 */