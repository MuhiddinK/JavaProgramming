package day14_StringMethods;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";

        //domain: gmail
        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        //email = email.substring(email.indexOf("@") + 1, email.lastIndexOf(".") );
        email = email.substring(beginningIndex, endingIndex );

        System.out.println(email);

        System.out.println("-------------------------------");

        String str1 = "Java is fun, Java is cool";
        //             012345678901
        String s1 = str1.substring(0, 10+1);

        int beg = str1.lastIndexOf("J");

        String s2 = str1.substring(beg);

        System.out.println(s1);
        System.out.println(s2);

    }
}
