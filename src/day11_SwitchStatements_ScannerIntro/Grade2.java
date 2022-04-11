package day11_SwitchStatements_ScannerIntro;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'K';
        //String result = "";

        switch (ch){// OR logic apply to switch like here 'A' || 'B' || 'C'

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");// result = "Passed"
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
        }

    }
}
