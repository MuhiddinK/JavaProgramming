package day16_ForLoopsStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School    !@#$%WoodenSpoon";

        String digits = "";//12345
        String letters = "";//CydeoSchoolWoodenSpoon
        String specialChars = "";//!@#$%

        for (int i = 0; i < str.length(); i++) {// i: index numbers (0 ~last index)

            char ch = str.charAt(i); //in order to get all of syn-gal characters

            if(ch >= '0' && ch <= '9'){ // if the characters between '0' and '9' then it is digit
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){  // if the characters between 'A' and 'Z' then it is letter
                letters += ch;
            }else if(ch >= 'a' && ch <= 'z'){ // if the characters between 'a' and 'z' then it is letter
                letters += ch;
            }else{ // if the character is neither digit nor letter, then it is special character
                if(ch != ' '){ // if the special character is not space = ignore the space
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
