package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        int[][] array2D = {{1,2,3} , {4,5,6,7} , {8,9,10,11,12} };

        for (int[] each1Array : array2D) {

           // System.out.println(Arrays.toString(each1Array));

            for (int eachElement : each1Array) {

                System.out.println(eachElement);
                
            }
            
        }
        
        
    }

   

}
