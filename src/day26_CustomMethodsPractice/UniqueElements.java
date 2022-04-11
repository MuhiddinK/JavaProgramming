package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,1,1,2,3,4,4,5,6,6};

        int[] unique = uniqueElements(array);

        System.out.println(Arrays.toString(unique));


        double[] array2 = {1.1,1.1,1.1,2.1,3.1,4.1,4.1,5.1,6.1,6.1};

        double[] unique2 = uniqueElements(array2);

        System.out.println(Arrays.toString(unique2));





    }


    // returns the UNIQUE integer element of the Array as a new Array
    public static int[] uniqueElements(int[] array){

        int[] result = {};// new int[0] = temporary array

        for (int each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }


    // returns the UNIQUE double element of the Array as a new Array
    public static double[] uniqueElements(double[] array){

        double[] result = {};// new int[0] = temporary array

        for (double each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }

    // returns the UNIQUE char element of the Array as a new Array
    public static char[] uniqueElements(char[] array){

        char[] result = {};// new int[0] = temporary array

        for (char each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }


    // returns the UNIQUE String element of the Array as a new Array
    public static String[] uniqueElements(String[] array){

        String[] result = {};// new int[0] = temporary array

        for (String each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }






}
