package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dbca";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        //System.out.println(Arrays.toString(chars1));
        //System.out.println(Arrays.toString(chars2));

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        //System.out.println();

        //System.out.println(Arrays.toString(chars1));
        //System.out.println(Arrays.toString(chars2));

        boolean anagram = Arrays.equals(chars1, chars2);

        System.out.println("anagram = " + anagram);






    }
}
//write a program that can check if str1 & str2 are build out the same characters