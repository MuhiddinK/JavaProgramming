package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers,1);// {100, 300, 400, 500, 600}

        System.out.println(Arrays.toString(numbers));

    }




    // 1. solution: removes the given index from an INTEGER Array, returns new Array
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


    // 1. solution: removes the given index from a DOUBLE Array, returns new Array
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


    // 1. solution: removes the given index from an INTEGER Array, returns new Array
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


    // 1. solution: removes the given index from an INTEGER Array, returns new Array
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






}
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array





 */