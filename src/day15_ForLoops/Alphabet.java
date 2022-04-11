package day15_ForLoops;

public class Alphabet {

    public static void main(String[] args) {

        //A ~ Z====>ASCII table 65==A, 90==Z

        for (int i = 65; i <=90; i++){
            System.out.print((char) i+" ");// casting int into char
        }

        System.out.println();

        System.out.println("-----------------------");

        for (char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("-------------------------------");

        for (char i = 'Z'; i >='A'; i--){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("-------------------------------------");

        for(char i = 100; i <= 140; i++){
            System.out.print(i+" ");
        }



    }
}
