package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    // 1 PRINT each INTEGER of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);            
        }
    }

    // 2 print each DOUBLE of a double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }

    // 3 print each CHAR of a char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }

    // 4 print each STRING of an String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }

    
    
    
    // 5 FIND the MAX INTEGER NUMBER from integer array
    public static int maxNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    // 6 find the MAX DOUBLE NUMBER from double array
    public static double maxNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }




    // 7 FIND the MIN INTEGER NUMBER from integer array
    public static int minNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    // 8 find the MIN DOUBLE NUMBER from double array
    public static double minNumber(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }




    // 9 CHECKS if the given INTEGER is contained in the integer Array, returns boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;

    }

    // 10 checks if the given DOUBLE is contained in the double Array, returns boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;

    }

    // 11 checks if the given CHAR is contained in the CHAR Array, returns boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;

    }

    // 12 checks if the given STRING is contained in the STRING Array, returns boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array) {
            if( each.contains(element) ){
                result = true;
            }
        }

        return result;

    }




    // 13 ADDS an INTEGER  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){

        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;// element needs to be assigned to the last index

        return result;

    }

    //  14 addS a DOUBLE after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length +1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;// element needs to be assigned to the last index

        return result;

    }

    // 15 adds a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[i] = element;// element needs to be assigned to the last index

        return result;

    }

    // 16 adds a CHAR after last index of a char array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[i] = element;// element needs to be assigned to the last index

        return result;

    }






    //  17 RETURNS the FREQUENCY of given element
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //  18 returns the FREQUENCY of given element
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //  19 returns the FREQUENCY of given element
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }

    //  20 returns the FREQUENCY of given element
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals(element)){
                count++;
            }
        }

        return count;
    }





    // 21 RETURNS the UNIQUE element of the Array as a new Array
    public static int[] uniqueElements(int[] array){

        int[] result = {};// new int[0] = temporary array

        for (int each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }

    // 22 returns the UNIQUE double element of the Array as a new Array
    public static double[] uniqueElements(double[] array){

        double[] result = {};// new int[0] = temporary array

        for (double each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }

    // 23 returns the UNIQUE char element of the Array as a new Array
    public static char[] uniqueElements(char[] array){

        char[] result = {};// new int[0] = temporary array

        for (char each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }

    // 24 returns the UNIQUE String element of the Array as a new Array
    public static String[] uniqueElements(String[] array){

        String[] result = {};// new int[0] = temporary array

        for (String each : array) {

            if(ArraysUtility.frequencyOfElement(array,each) == 1){
                result = ArraysUtility.addElement(result, each); // new array created ==>   int[] result = {2,3,5};
            }
        }

        return result;
    }







    // 25      REMOVE      the given index from an INTEGER Array, returns new Array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length-1];// the length of the new array(result) will be one element reduced (-1)

        int j = 0; // j represents the index of the nex array(result)
        for (int i = 0 ; i < array.length ; i++) {// takes each element from the given array
            if( i == index){// when it comes to given index
                continue;// skip the given index
            }

            result[j++] = array[i]; // each element will be added to the new array (=result)

        }
        return result;
    }

    // 26 removes the given index from a DOUBLE Array, returns new Array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length-1];// the length of the new array(result) will be one element reduced (-1)

        int j = 0; // j represents the index of the nex array(result)
        for (int i = 0 ; i < array.length ; i++) {// takes each element from the given array
            if( i == index){// when it comes to given index
                continue;// skip the given index
            }

            result[j++] = array[i]; // each element will be added to the new array (=result)

        }
        return result;
    }

    // 27 removes the given index from an INTEGER Array, returns new Array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length-1];// the length of the new array(result) will be one element reduced (-1)

        int j = 0; // j represents the index of the nex array(result)
        for (int i = 0 ; i < array.length ; i++) {// takes each element from the given array
            if( i == index){// when it comes to given index
                continue;// skip the given index
            }

            result[j++] = array[i]; // each element will be added to the new array (=result)

        }
        return result;
    }

    // 28 removes the given index from an INTEGER Array, returns new Array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length-1];// the length of the new array(result) will be one element reduced (-1)

        int j = 0; // j represents the index of the nex array(result)
        for (int i = 0 ; i < array.length ; i++) {// takes each element from the given array
            if( i == index){// when it comes to given index
                continue;// skip the given index
            }

            result[j++] = array[i]; // each element will be added to the new array (=result)

        }
        return result;
    }






    // 29 - 1. solution:       MERGE         the given two INTEGER arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each);
        }

        for (int each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }

    // 30 - 2. solution: merge the given two DOUBLE arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = new double[arr1.length + arr2.length];

        int i = 0;

        for (double each : arr1) {
            result[i++] = each;
        }

        for (double each : arr2) {
            result[i++] = each;
        }

        return result;

    }

    // 31 - 1. solution: merge the given two CHAR arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};

        for (char each : arr1) {
            result = addElement(result, each);
        }

        for (char each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }

    // 32 - 1. solution: merge the given two STRING arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};

        for (String each : arr1) {
            result = addElement(result, each);
        }

        for (String each : arr2) {
            result = addElement(result, each);
        }

        return result;

    }






    // 33        REVERSE       INT      ARRAY
    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0 ; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // 34        REVERSE       DOUBLE      ARRAY
    public static double[] reverse(double[] array){

        double[] result = new double[array.length];

        for (int i = array.length - 1, j = 0 ; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // 35        REVERSE       CHAR      ARRAY
    public static char[] reverse(char[] array){

        char[] result = new char[array.length];

        for (int i = array.length - 1, j = 0 ; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }

    // 36        REVERSE       STRING      ARRAY
    public static String[] reverse(String[] array){

        String[] result = new String[array.length];

        for (int i = array.length - 1, j = 0 ; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        return result;
    }








    // 37  REPLACE  the element of the given array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // 38   REPLACE  the element of the given array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // 39   REPLACE  the element of the given array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // 40   REPLACE  the element of the given array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }





    // 41   REPLACES all the matching oldValues of the array with the newValues
    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;

    }

    // 42   REPLACES all the matching oldValues of the array with the newValues
    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;

    }

    // 43   REPLACES all the matching oldValues of the array with the newValues
    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i] == oldValue){
                array[i] = newValue;
            }
        }

        return array;

    }

    // 44   REPLACES all the matching oldValues of the array with the newValues
    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {

            if(array[i].equals(oldValue) ){
                array[i] = newValue;
            }
        }

        return array;

    }





    // 45   REMOVE the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};// yeni array bu bos arraya yazilacak

        for (int each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    // 46   REMOVE the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};// yeni array bu bos arraya yazilacak

        for (double each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    // 47   REMOVE the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};// yeni array bu bos arraya yazilacak

        for (char each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    // 48   REMOVE the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};// yeni array bu bos arraya yazilacak

        for (String each : array) {
            if( !ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }




    // 49 convert Array to ArrayList
    public static ArrayList<Integer> convertArrayYoArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;

    }




}
