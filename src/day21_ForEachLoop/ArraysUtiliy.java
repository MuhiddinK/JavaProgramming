package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtiliy {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);//hashcode ([I@27f674d)
        System.out.println(Arrays.toString(nums));//Array is now converted to the String to print

        System.out.println(nums[0]);//this is the first element of the array


        System.out.println("---------------------------------");

        int[] scores = {95, 100, 55, 65, 85, 78};

        Arrays.sort(scores);// {55, .... , 100}

        System.out.println(Arrays.toString(scores));

        System.out.println("Minimum score= "+scores[0]);
        System.out.println("Max score= " + scores[scores.length-1]);

        System.out.println("------------------------------------");

        String[] names = {"Anna", "Gunay", "Zuhal", "Maria", "Selin", "Ahmet"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------------------");

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 3, 2};

        boolean r1 = Arrays.equals(arr1, arr2);

        System.out.println(r1);

        Arrays.sort(arr1);// 1, 2, 3
        Arrays.sort(arr2);// 1, 2, 3

        boolean r2 = Arrays.equals(arr1,arr2);




    }
}
