package day11_SwitchStatements_ScannerIntro;

public class GradesInSwitch {

    public static void main(String[] args) {

        char ch = 'A';// ==
        String result = "";

        switch (ch){

            case 'A':
                System.out.println("Excellent"); // result = "Excellent";
                break;
            case 'B':
                System.out.println("Great");// result = "Great";
                break;
            case 'C':
                System.out.println("Good");// result = "Good";
                break;
            case 'D':
                System.out.println("Passed");// result = "Passed";
                break;
            case 'E':
                System.out.println("Failed");// result = "Failed";
                break;

            default:
                System.out.println("Invalid");// result = "Invalid";

            //    System.out.println(result);
        }


    }
}
