package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

   //index of the elements: 0 1 2     0 1 2 3     0 1 2  3   4
        int[][] array2D = {{1,2,3} , {4,5,6,7} , {8,9,10,11,12} };
    // index of Arrays:      0           1             2

        for (int i = 0 ; i < array2D.length ; i++) {// this loop to retrive all of the single Array

            System.out.println(Arrays.toString(array2D[i]));// i: index numbers of single dimensional arrays
            /* output:
                         [1, 2, 3]
                         [4, 5, 6, 7]
                         [8, 9, 10, 11, 12]
             */

            for (int j = 0; j < array2D[i].length; j++) {// j : index number of elements

                System.out.print(array2D[i][j]+" ");//output: 1 2 3 4 5 6 7 8 9 10 11 12
                
            }

            System.out.println();
            /*
            Output :
                    1 2 3
                    4 5 6 7
                    8 9 10 11 12
             */


        }

    }
}
