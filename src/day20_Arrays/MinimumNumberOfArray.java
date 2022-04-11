package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int min = numbers[0]; // first we assume that the first element(10) is the smallest number than we will compare the other elements

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min ){// if there is element in the array that is smaller than the current min number
                min = numbers[i]; // assigning smaller number to variable min
            }
        }

        System.out.println(min);
    }
}
