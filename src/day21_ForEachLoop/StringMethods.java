package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("------------------toCharArray() METHOD --------------------");


        String str = "Java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }

        System.out.println("-------------SPLIT METHOD--------------------");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("---------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------");

        String s = "Today is nice. Today is monday. Today we learn java";

        String[] sentences = s.split("\\. ");// to split with a point we have to use special character '\\'

        System.out.println(Arrays.toString(sentences));






    }
}
