package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26]; // ingiliz alfabesine gore

        /* TO ASSIGN A VARIABLE WE HAVE TO KNOW TWO THINGS: 1.index number
                                                            2.the char
        letters[0] = 'A';
        letters[1] = 'B';
         */

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {// i represents the characters; j represents index numbers
            letters[j] = i;
        }

        /*
        for (int i = 0, j = 'A'; i < letters.length; i++, j++) {// j represents the characters; i represents index numbers
            letters[i] = (char)j;
        }

         =================================================================================================

        char ch = 'A';
        for (int i = 0 ; i < letters.length; i++) {// j represents the characters; i represents index numbers
            letters[i] = ch++;// either character and index number increase at the same time

        */

        System.out.println(Arrays.toString(letters)); // [A~Z]

        System.out.println("-------------------------------------------------------");


    }
}
