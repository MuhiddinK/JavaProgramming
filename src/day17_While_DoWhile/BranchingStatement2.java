package day17_While_DoWhile;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i < 'E'; i++) {

            if(i == 'C'){// TO SCIP 'C'
                continue;
            }
            System.out.println(i);//A B D ...........
        }

        System.out.println("-------------------------------------------");

        // Print all even numbers 1 ~10

        for (int i = 0; i < 11; i++) {

            if(i%2 != 0){
                continue;// SKIP : 1 3 5 7 9
            }
            System.out.println(i);

        }


        System.out.println("------------------------------------------------");

        // Print all odd numbers 1 ~10

        for (int i = 0; i < 11; i++) {

            if(i%2 == 0){
                continue;// SKIP : 2 4 6 8 10
            }
            System.out.println(i);

        }

    }
}
