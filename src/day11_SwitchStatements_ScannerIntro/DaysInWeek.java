package day11_SwitchStatements_ScannerIntro;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 9;

       /* if(number == 1) {
            System.out.println("monday");
        }
        ....
        /*

        */

        switch(number){//1,2,3,4,5,6,7. [ comparing only DATA! ( == only equality boolean operator works with switch) ]
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default://only gets executed if none of the case blocks are matching
                System.out.println("In Valid Number");
                break;// this break is not compulsory now, closing curly braces also exits the execution because it is the last line!

        }
    }
}
