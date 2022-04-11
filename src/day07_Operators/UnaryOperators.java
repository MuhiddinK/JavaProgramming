package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < num2);
        System.out.println(num1 > num2);

        System.out.println("--------------------------------");

        int a = 25;

        System.out.println(++a);//26
        System.out.println(--a);//25

        int b =5;
        ++b; // pre increment

        System.out.println(b);

        --b; //pre decrement

        System.out.println(b);

        int c = 100;

        System.out.println(++c);//pre increment

        System.out.println(c++);//post increment
        System.out.println(c);

        System.out.println("____________________________________");

        int x = 200;

        System.out.println( --x ); // pre decrement



        int y = 200;

        System.out.println( y-- );// post decrement : first passes the current value, then decreases the value by 1
        System.out.println(y); // 199


        System.out.println("___________________________");

        int z = 45;

        System.out.println(++z);// 46
        System.out.println(z++);//46
        System.out.println(z);// 47

        int q = 30;

        System.out.println(--q); // 29
        System.out.println(q--); // 29, then 28
        System.out.println(q); //28









    }


}
