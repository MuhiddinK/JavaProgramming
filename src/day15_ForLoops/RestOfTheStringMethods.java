package day15_ForLoops;

public class RestOfTheStringMethods {

    public static void main(String[] args) {

       String str = " ";

       boolean r = str.isEmpty();

        System.out.println(r);

       boolean r1 = str.isBlank();

        System.out.println(r1);

        System.out.println("---------------------------------------");


        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equalsIgnoreCase(s2));//true


        System.out.println("-------------------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasjava = sentence.contains("java");
        boolean hasJavaLower = sentence.toLowerCase().contains("java");//case problemini asmak icin, cunku ignore metodu yok contain de
        boolean r3 = sentence.contains("java") || sentence.contains("JAVA");// we can also use toUpperCase method


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasjava);
        System.out.println(hasJavaLower);
        System.out.println(r3);

        System.out.println("-----------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));//true
        System.out.println(input1.contains("Java"));//true

     System.out.println(input1.toLowerCase().contains("java"));//true
     System.out.println(input1.toUpperCase().contains("JAVA"));//true

     System.out.println("-------------------------------------");

     String a = "Wooden Spoon";

     boolean x = a.startsWith("Woo");
     boolean y = a.endsWith("Spoon");
     boolean z = a.toLowerCase().startsWith("wood");//to ignore case sensitivity
     boolean t = a.toUpperCase().startsWith("WOOD");//to ignore case sensitivity

     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
     System.out.println(t);


    }
}
