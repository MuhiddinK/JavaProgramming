package day32_Constructor_Overloading;

public class Test { // CHAIN CONSTRUCTORS

    public Test(){// A
        System.out.print("A ");
    }

    public Test(int a){// A B
        this();// default constructor
        System.out.print("B ");
    }

    public Test(double a){ // A B C
        this(10);
        System.out.print("C ");
    }

    public Test(String str){ // A B C D
        this(2.5);
        System.out.print("D ");
    }

    public static void main(String[] args) {

        new Test();// A
        new Test(10);// A B
        new Test(2.5); // A B C
        new Test("str"); // A B C D


    }









}
