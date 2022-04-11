package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabets = new char[26]; // [Z~A]


        for (char i = 0, j = 'Z' ; i < alphabets.length ; i++, j--) { //[Z~A]
            // j represents the characters; i represents index numbers
            alphabets [i] = j;
        }

        System.out.println(Arrays.toString(alphabets));// print the whole Array
        // System.out.println(alphabets[0]);// print the element

    }
}
