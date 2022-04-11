package week09;

import java.util.Arrays;

public class ArraysBinarySearchMethod {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int index = Arrays.binarySearch(nums, 7);

        System.out.println(index);// gives index number of the value


    }


}
