package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class TestArraysMethods {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);


        System.out.println("----------------------------------");


        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        ArraysUtility.printEachElement(arr2);


        System.out.println("----------------------------------");


        char[] arr3 = {'A', 'B', 'C'};
        ArraysUtility.printEachElement(arr3);



        System.out.println("----------------------------------");


        String[] arr4 = {"Muti", "Sevda", "Tahsin", "Yasin", "Asya"};
        ArraysUtility.printEachElement(arr4);


        System.out.println("--------------------------------------------");


        int[] arrMax = {1,2,3,4,5};
        int max1 = ArraysUtility.maxNumber(arrMax);
        System.out.println("max1 = " + max1);



        System.out.println("----------------------------------");


        double[] arrMax2 = {1.1,2.2,3.3,4.4,5.5};
        double max2 = ArraysUtility.maxNumber(arrMax2);
        System.out.println("max2 = " + max2);


        System.out.println("----------------------------------");


        int[] a1 = {1,2,3,4,5};
        boolean r1 = ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);




    }



}
