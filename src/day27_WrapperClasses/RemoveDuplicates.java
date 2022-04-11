package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,2,2,2,2,3,3};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------------");

        String[] str = {"Ali","Ali","Ali","Ali", "Veli","Veli","Veli","Veli", "Deli","Deli","Deli","Deli", "Seli"};

        str = removeDuplicates(str);

        System.out.println(Arrays.toString(str));


    }


    // REMOVE the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};// yeni array bu bos arraya yazilacak

        for (int each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    // REMOVE the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};// yeni array bu bos arraya yazilacak

        for (double each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    // REMOVE the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};// yeni array bu bos arraya yazilacak

        for (char each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    // REMOVE the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};// yeni array bu bos arraya yazilacak

        for (String each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }




}
