package week05;

import java.util.Scanner;

public class EmailCheckInterview {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please put a valid email address: test@example.com");
        String email = input.next();

        boolean result = true;

        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if(atSignIndex<1 //  0 (no character before @ sign) or -1 (there is no @ sign)
                ||atSignIndex>=email.length()-3 // (a@a.a: indexof("@):equal to length()-4 or less )
                ||atSignIndex!=email.lastIndexOf("@")) // there is onle one @ sign, or if they are not equal means more @ sign
        {
            result = false;
        }
        if( dotIndex < 1 // 0 (no character before dot sign) or -1 (there is no dot sign)
                || dotIndex == email.length()-1 // checking if it is the last character
                || atSignIndex > dotIndex  // checking if @ sign is before dot sign
                || atSignIndex+1 == dotIndex){ // checking if there is a character between @ sign and dot sign
            result = false;
        }

        System.out.println("result = " + result);



        input.close();
    }

}
/*
indexof("@")<1 :  0 (no character before @ sign) or -1 (there is no @ sign)
        indexof("@") >= email.length()-3   (a@a.a: indexof("@):length()-4 )
        what if we have 2 @ signs :
        the index of @ sign == last index of @ sign: there is one @ sign, otherwise problem
        DOT Conditions
        indexof(".")<1 :  0 (no character before dot sign) or -1 (there is no dot sign)
        indexofDotSign == email.length()-1 : problem
        the index of @ sign > bigger than indexofDotSign: problem
        the index of @ sign + 1 ==  indexofDotSign (@.): there is no character in between : problem
 */