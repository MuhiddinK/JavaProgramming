package day23_CustomMethods_Void;

public class CustomMethodPractice {
    /*
1 print "Hello World" 5 times
2 print "hello Cydeo" 5 times
3 print even numbers btwn 1~10
 */

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println();
        helloCydeo5Times();
        System.out.println();
        evenNumbers();

    }


    public static void helloWorld5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

    }

    public static void helloCydeo5Times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }

    }

    public static void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i+", ");
        }
    }

}
