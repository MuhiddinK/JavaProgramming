package day32_Constructor_Overloading;

public class ConsructorCalls {

    public ConsructorCalls(){
        System.out.println("Default Constructor");
    }


    public ConsructorCalls(int a){
        this();// Default Constructor
        System.out.println("Constructor with int argument");
        //this(); // must be inthe first place
    }


    public ConsructorCalls(String str){
        //this(); CANNOT call more than one constructor
        this(10);// Default Constructor, Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConsructorCalls obj1 = new ConsructorCalls();

        System.out.println("-------------------------------------------------");


        ConsructorCalls obj2 = new ConsructorCalls(10);// int

        System.out.println("-------------------------------------------------");

        ConsructorCalls obj3 = new ConsructorCalls("str");// String

        System.out.println("-------------------------------------------------");

    }





}
