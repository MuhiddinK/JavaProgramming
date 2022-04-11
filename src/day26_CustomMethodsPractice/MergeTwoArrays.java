package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

import static utilities.ArraysUtility.merge;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));


    }



}
