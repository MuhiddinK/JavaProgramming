package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        //int[][] array2D = {{1,2,3} , {4,5,6,7} , {8,9,10,11,12} };
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7, 8,9};

        int[][] array2D = {{1,2,3} , {4,5,6} , {7,8,9} };

        // 3 Dimensional Array contains 2D arrays


        //                        0         1         2            0             1            2
        int[][][] array3D = { {{1,2,3} , {4,5,6} , {7,8,9} }, {{10,20,30} , {40,50,60} , {70,80,90} }};
        //                      0 1 2     0 1 2     0 1 2        0  1  2      0  1  2      0  1  2
        //                                  0                              1

        System.out.println(Arrays.deepToString(array3D));// [[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]

        System.out.println(Arrays.deepToString(array3D[1]));//[[10, 20, 30], [40, 50, 60], [70, 80, 90]]

        System.out.println(Arrays.toString(array3D[1][1]));//[40, 50, 60]

        System.out.println(array3D[1][1][1]);//50

        System.out.println("--------------------------------------------------------");


        for (int[][] each2D : array3D) {//[[1, 2, 3], [4, 5, 6], [7, 8, 9]]  ,  [[10, 20, 30], [40, 50, 60], [70, 80, 90]]

            for (int[] each1D : each2D) {// [1, 2, 3] , [4, 5, 6] , [7, 8, 9] , [10, 20, 30] , [40, 50, 60] , [70, 80, 90]

                for (int eachElement : each1D) {//1 2 3 4 5 6 7 8 9 10 20 30 40 50 60 70 80 90

                    System.out.print(eachElement+" ");



                }

            }

        }





    }
}
