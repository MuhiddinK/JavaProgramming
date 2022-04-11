package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String [] group1 = {"jon", "joys", "James"};
        String [] group2 = {"Aeron", "Shay", "Breanna"};
        String [] group3 = {"Cass", "Tahir", "Aygun"};

        // Array size bilinip icerik bilinmedigi durumlara bu sekilde Array olusturuyoruz
        String[][] groups = new String[3][];// Size=3 ; index: 0,1,2
        groups[0] = group1;// index: 0
        groups[1] = group2;// index: 1
        groups[2] = group3;// index: 2

        System.out.println(Arrays.deepToString(groups) );// toString method is only for one dimensional array

        System.out.println("-----------------------------");

        /*
        {1,2,3}
        {4,5,6,7}
        {9,10,11,12}
         */

   //index of the elements: 0 1 2     0 1 ...     0  1 2   3
        int[][] array2D = {{1,2,3} , {4,5,6,7} , {9,10,11,12} }; // icerigi de biliyorsak bu sekilde Array olusturuyoruz
        // index:            0          1             2

        System.out.println(Arrays.deepToString(array2D));// to get all of the arrays and elements

        System.out.println(Arrays.toString(array2D[1]));// to retrive the array index 1 = {4,5,6,7}

        System.out.println(array2D[2][3]);// to get the index(2) element of the Array index(3)


    }
}
/*
three group of people
String [] group1 = {........}
String [] group2 = {........}
String [] group3 = {........}
 */