package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0]; // first we assume that the first element is the biggest number than we will compare the other elements

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max ){// if there is element in the array that is greater than the current max number
                     max = numbers[i]; // assigning greater number to variable max
            }
        }

        System.out.println(max);

    }
}
