package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";// Parce Method : Converts the String into integer

        int num = Integer.parseInt(str); // returns int

        System.out.println(num + 1); // 124 (increment)
        System.out.println(str + 1); // 1231 (concatenation)


        String str2 = "10.5"; // double

        double num2 = Double.parseDouble(str2);

        System.out.println(num2); // 10.5
        System.out.println(num2 + 1);// 11.5


        int maxOfJava = Integer.MAX_VALUE; // max integer in java
        int minOfJava = Integer.MIN_VALUE; // min integer in java

        System.out.println("minOfJava = " + minOfJava);
        System.out.println("maxOfJava = " + maxOfJava);

        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        String s1 = "Maybe";

        boolean r1 = Boolean.parseBoolean(s1);

        System.out.println(r1);


        System.out.println("----------------------------------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);// Integer
        int y = Integer.valueOf(s2); // unboxing

        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
        Double z = Double.valueOf(s3); // Double

        System.out.println(z);


        System.out.println("----------------------------------------------------");

        char ch1 = 'A';

        // isDigit()
        boolean r2 = Character.isDigit(ch1);


        // isLetter
        boolean r3 = Character.isLetter(ch1);

        // is special char
        boolean r4 = !Character.isLetterOrDigit(ch1);


        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        // lowerCase
        boolean r6 = Character.isLowerCase(ch1);



        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("---------------------------------------------");

        String s = "ab1cde2efg3hi4";
        
        int sum = 0;

        for (char each : s.toCharArray()) {

            if(Character.isDigit(each) ){
                sum += each;
            }
            
        }

        System.out.println("sum = " + sum);


    }

}
