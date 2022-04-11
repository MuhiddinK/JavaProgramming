package day37_Inheritance;

class A{

    public A(int a){
        System.out.println("A");
    }

}

class B extends A{


    public B(){ // super() : compiler gives default super keyword
        super(9); // if there is parameter compiler does not gives super keyword, so we have to give explicitly
        System.out.println("B");
    }

}



public class ConstructorPractice {

    public static void main(String[] args) {


        B obj = new B();

    }
}
