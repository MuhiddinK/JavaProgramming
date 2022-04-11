package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] array2D = {{1,2,3} , {4,5,6,7} , {8,9,10,11,12,13} };

        for (int i = array2D.length - 1; i >= 0; i--) {//i: index number of 1 dimensional array starting from last index to 0

            for (int j = 0; j < array2D[i].length; j++) {//j: index number of each elements starting from 0

                System.out.print(array2D[i][j]+" ");

            }

            System.out.println();



        }

        System.out.println("----------------------------------------------");

        for (int i = 0; i < array2D.length; i++) {

            for (int j = array2D[i].length - 1; j >= 0; j--) {

                System.out.print(array2D[i][j]+" " );

            }

            System.out.println();

        }


        System.out.println("-------------------------------------------------");


        for (int i = array2D.length - 1; i >= 0; i--) {

            for (int j = array2D[i].length - 1; j >= 0; j--) {

                System.out.print(array2D[i][j]+" ");

            }

            System.out.println();

        }



    }

}
/*
task1 :
        8 9 10 11 12 13
        4 5 6 7
        1 2 3


task2 :
        3 2 1
        8 77 6 5 4
        13 12 11 10 9
 */