package week10;

public class ArrayListExample {

    public static void main(String[] args) {


        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

        String letters = "";
        String uppercaseLetters = "";
        String lowerCaseLetters = "";
        String digits = "";
        String specialChars = "";

        for (char each : strThree.toCharArray()) {   // char each : primitive
            if (Character.isLetter(each)) {
                letters += each;
                if (Character.isUpperCase(each)) {
                    uppercaseLetters += each;
                } else {
                    lowerCaseLetters += each;
                }
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("uppercaseLetters = " + uppercaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


        System.out.println("------------------------------------------------");

        int a = 0;
        while(a<=6){
            a+=2;
        }
        System.out.println("a = " + a);

        System.out.println("----------------------------------------------");




    }
}
