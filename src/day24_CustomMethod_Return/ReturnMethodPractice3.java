package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        String str = "aabccdee";

        for (int i = 0 ; i < str.length() ; i++) {// to compare all of the characters placed the variable inside the loop
            int frequency = frequency(str, str.charAt(i));// variable name and method name can br the same

            if(frequency == 1){
                System.out.println(str.charAt(i));
            }

        }

        int frequency = frequency(str,'a');// variable name and method name can be the same



    }


    //                                "aaa"      'a'
    public static int frequency(String str, char ch){

        int count =0;

        for (char each : str.toCharArray()) {
            if(each == ch){
                count++;
            }
        }

        return count;

    }







}
