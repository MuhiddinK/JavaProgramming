package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefiiiiiiiiiiiiiijkkkkkkkkkklmmmmmmmmmmmmmmn";

        // str.split(""); // this method returns a String Array

        // ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")) ); // we can also directly convert it into ArrayList

        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr) );

        System.out.println("list = " + list);

        String unique = "";

        for (String each : list) {

            int frequency = Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;// String DO NOT HAVE    add method, so we have to use concatenation
            }
            
        }

        System.out.println("unique = " + unique);

    }
}
