package utilities;

import java.util.Arrays;

public class StringUtility {


    // 1 prints each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }


    // 2 REVERSES the String and returns the reversed String
    public static String reverse(String str){ // "Java"
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result; // "avaJ"

    }



    // 3 PRINTS each character of a String in separate lines
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }



    // 4 checks if the String is PALINDROME, return boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }



    // 5 checks if the String is ANAGRAM, returns boolean
    public static boolean anagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }



    // 6 removes the DUPLICATES from given String, returns String
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if( !result.contains(""+each)){
                result += each;
            }

        }

        return result;

    }



}
