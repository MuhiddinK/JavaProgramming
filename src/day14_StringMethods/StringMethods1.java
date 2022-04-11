package day14_StringMethods;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "     batch 25         ";
        str1 = str1.trim();//it will create new String without white spaces==("batch 25")
        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");// 9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("am");
        System.out.println("n3 = " + n3);//10

        int n4 = str3.indexOf("g");//8
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");//en son 'g'
        System.out.println("n5 = " + n5);

        System.out.println("-------------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        //int fouthA = s.indexOf("ava W");
        //int fouthA = s.lastIndexOf("av");
        int fouthA = s.indexOf("Ca") + 1;
        System.out.println("fouthA = " + fouthA);

        int fifthA = s.lastIndexOf("va") + 1;
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);


    }
}
