package day26_CustomMethodsPractice;

import java.util.Arrays;

import static utilities.ArraysUtility.merge;

public class MergeTwoArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {4,5,6};

        int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));


        System.out.println("--------------------------------------");

        String[] st1 = {"A", "B", "C"};
        String[] st2 = {"D", "G", "K"};

        String[] result = merge(st1,st2);

        System.out.println(Arrays.toString(result));



    }


}
