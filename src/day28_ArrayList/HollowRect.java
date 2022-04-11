package day28_ArrayList;

public class HollowRect {

    public static void main(String[] args) {

    printHollowRect();


    }


    public static void printHollowRect(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > 0 && i < 4 && j > 0 && j < 4){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


}
/*
    Create a method PrintHollowRect that prints a 5 by 5 hollow rectangle;

             *****
             *   *
             *   *
             *   *
             *****

   Hint: you will need to use two nested for loops,
   and check if its the last or first iteration of
   the loop(so you will know whet to print"*" or " ")
 */