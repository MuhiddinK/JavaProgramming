package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        String[] students = {"elif", "gul", "bulut", "tas", "yagmur"};
        String[] earlyBirds = Arrays.copyOf(students, 3);

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        numbers = Arrays.copyOf(numbers,5);// {1,2,3,4,5}

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------COPY OF RANGE--------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2, 6+1);// The Last index is NOT included like subString method

        System.out.println(Arrays.toString(ch2));


        int[] scores = {10,20,30,40,50,60,70,80,90};
        // index        1   2  3  4  5  6  7  8  9
        int[] result = Arrays.copyOfRange(scores, 5, scores.length);// sonuna kadar copy

        System.out.println(Arrays.toString(result));

    }
}
