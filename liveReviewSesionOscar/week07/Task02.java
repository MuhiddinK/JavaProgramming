package week07;
/*
Oscar'in cozumu  :

  for (int i = 1; i <= 6; i++) {  // handles rows

            for (int j = 1; j <= i; j++) {   // handles columns

                // ternary operator

              // System.out.print(j%2==1? 1 : 0 ); // for odd columns print "1", for even columns "0"

                if(j%2==1){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }

            }
            System.out.println();
 */
public class Task02 {
    public static void main(String[] args) {



        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i+1; j++) {
                if (j%2 != 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                    //ternary operators= System.out.print(j % 2 != 0 ? 1 : 0);
                }
            }
            System.out.println();
        }

    }
}
/*
Print the pattern below:
    1
    10
    101
    1010
    10101
    101010
 */