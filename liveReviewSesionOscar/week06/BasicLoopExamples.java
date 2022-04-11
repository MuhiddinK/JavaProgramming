package week06;

public class BasicLoopExamples {

    public static void main(String[] args) {
/*
Write a for loop that displays the following set of numbers:
0, 10, 20, 30, 40, 50,.....1000
 */
        for (int i = 0; i <= 1000; i+=10) {//i=local variable, only works inside for loop
            System.out.print(i+", ");// this cannot work out of the loop !!!

        }
        System.out.println();
        System.out.println("=============================");

        int z =0;// i=global variable for the whole class

        for (   ; z <= 1000 ; ) {
            System.out.print(z+", ");// this can work in or out of the loop now
            z+=10;//this is iteration
        }
        System.out.println("===================================================");

/*
Write a program that displays all odd numbers between 3-130 in the same line
 */
        for (int i = 3 ; i < 130 ; i+=2) {
            System.out.print(i+" ");

        }

        System.out.println("===================================================");

/*
question 3:
Write a program that displays the number of even numbers between 5 and 50(inclued)
 */

        for (int i = 5; i <= 50; i++) {
            if(i%2==0)
                System.out.print(i+", ");

        }

        System.out.println("==============================");
        
        /*
question 3:
Write a program that counts the even numbers between 5 and 50(inclued)
 */
        int countTheEven=0;
        for (int i = 5; i <= 50 ; i++) {

            if(i%2==0){
                ++countTheEven;
            }
            
        }
        System.out.println("Count Of Even numbers: " +countTheEven);

        System.out.println("===========================================");

        /*
        Question 4:

        Print the table of 12 using for loop.
        Output should be in following format:
        12 x 1 = 12
        12 x 2 = 24
        12 x 3 = 36
        12 x 4 = 48
        .
        .
        .
        12 X 10 = 120
         */

        int j = 1;
        for (  ; j<=10 ; j++) {

            System.out.println("12 x "+j+" = "+ (12*j));

        }
    }
}
