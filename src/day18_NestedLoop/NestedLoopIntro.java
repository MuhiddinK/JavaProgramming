package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("------------------------------------");

        for (int j = 0; j < 4; j++) {// bu loop icindeki loop'u 4 defa tekrar ettirecek

            for (int i = 0; i < 5; i++) {// bu loop 5 defa kendisi tekrar ediyor, 4 defa da diger loop tekrar ettirecek 4*(=20 defa tekrar edecek
                System.out.println("Wooden Spoon");
            }
        }

    }
}
/*
Nested loop:  loop inside another loop (inner & outer loops)

        one iteration of the outer loop, executes all the iteration of the inner loop
 */