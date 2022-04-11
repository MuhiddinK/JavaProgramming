package day25_CustomMethods_Overloading;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};
        double[] doubleArray = {5.4,6.0,1.3,4.5};
        char[] charArray = {'A','B','C','D'};

        System.out.println("--------------------------------------------------------------");

        int sum = sumOfNumbers(10,20,30);
        double sum1 = sumOfNumbers(1.2,2.9,3.8,4.9);


    }



    public static int sumOfNumbers(int num1, int num2){
        return  num1+num2;
    }


    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }



    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }


    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;// == return sumOfNumbers(double num1, double num2) + num3;
    }



    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }


    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return num1+num2+num3+num4;// == return sumOfNumbers(double num1, double num2, double num3) + num4;
    }


}
