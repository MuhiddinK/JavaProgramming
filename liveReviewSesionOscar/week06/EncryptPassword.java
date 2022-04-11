package week06;

public class EncryptPassword {

        /**
         * 5.
         * Given a String password. Encrypt with "x" a given password
         * and print.
         * (do with for loop)
         * password: cydeo
         * encript with char : x
         * output : cxyxdxexox
         */

    public static void main(String[] args) {

        String password = "cydeo";

        char encriptWithChar = 'x';

        String encriptedPassword = "";

        for (int i = 0; i < password.length(); i++) {
            encriptedPassword += ""+password.charAt(i)+encriptWithChar;//String + char + char = String

        }

        System.out.println("encriptedPassword = " + encriptedPassword);

    }
}
