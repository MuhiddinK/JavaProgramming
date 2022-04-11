package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {

        byte a = 100;
        short b = a; // what happens in compiler is; short b = (short)a

        int c = b; // copmpiler going to cast short to int
        // this is implicit casting

        long d = c;
        float e = d;
        double f = e;
        System.out.println("-----------------------");

        int x = 55;
        short y = (short)x; // explicit casting; casting larger to smaller

        System.out.println(x + " : " + y);


        long j = 1000000;
        short k = (short) j;

        System.out.println(j+ ":" +k);// because the range of short around max 32000, the result is differebt than 1000000

        double l = 2.5;
        float m = (float) l;

        System.out.println(l+ " : " +m);


        double n = 10.8;
        int s = (int)n; // int=10

        System.out.println(n +" : "+s);

        System.out.println("________________________");


        double d1 = 20.5;
        short s1 = (short) d1;// ALT + ENTER (Short-Cut)
        // another Short-Cut is clicking the error sign on the left

        System.out.println(d1 + " : " +s1);

        float f1 = 30.5f;
        long l1 = (long) f1;

        System.out.println(f1+" : "+l1);















    }




}
