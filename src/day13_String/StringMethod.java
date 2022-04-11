package day13_String;

public class StringMethod {

    public static void main(String[] args) {

       String word = "CYDEO";
           //index:   01234

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        System.out.println("----------------------------------");

        String s1 = "Batch 25 is the best batch.";

        int total = s1.length();
        System.out.println("total = " + total);

        char lastCharacter = s1.charAt( s1.length()-1 );
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("-----------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase();//it CANNOT modify but create new String object!

        System.out.println(str);

        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println("s = " + s);



    }
}
