package day23_CustomMethods_Void;

public class CustomMethodsWithParameters<puplic> {

    public static void main(String[] args) {

        // oddOrEven();// the method demands additional info to complete its task

        oddOrEven(10);

        ageOfPerson(1977);


    }

    // create a function that can check if a number is odd or even number
    public static void oddOrEven(int number){// 10

        if(number % 2 ==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }

    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){


        int age = 2022 - birthYear;

        System.out.println("Your age is " + age);

    }

    // create a function that can print all the numbers between x and y


}
