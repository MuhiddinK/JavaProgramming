package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 45 years old
        byte age = 45;

        // weight: 160 pounds
       //  byte weight 160; // 160 is out of byte range
        //  byte weight -150; // -150 is out of byte range

        short weight = 160; // 160 is within the range of short

        int salary = 100_000;// int is the preferred data type for integer numbers.

        // long asset = 3_333_333_333;// "L" or "l" have to be added after the numbers to accept the number.

        long ass = 3_333_333_333L;

        long asse = 3_333_333_333l;
        //tax int = 0.26

        float tax = 0.26F;

        double PI = 3.14; // it is the preferred

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 15000;
        System.out.println("ch3 = " + ch3);


        char gender = 'F';

        char grade = 'A';

        char yesNo = 'Y';

        boolean isEmployeed = true;
        boolean isMarried = false;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);


        String name = "Muhiddin Karatas"; // sequence of characters (String of text)
        String city = "Bolu";
        String country = "France";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("country = " + country);





















    }


}
