package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 3; //1 ~ 7

        if(n == 1){
            System.out.println("Monday");
        }else if(n == 2){
            System.out.println("Tuesday");
        }else if(n == 3){
            System.out.println("Wednesday");
        }else if(n == 4){
            System.out.println("Thursday");
        }else if(n == 5){
            System.out.println("Friday");
        }else if(n == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");}

        System.out.println("--------------------------------");

        int day = 3;

        System.out.println((day == 1)? "Monday" :(day ==2)? "Tuesday" :(day ==3)? "Wednesday":(day ==4)?
                "Thursday":(day ==5)? "Friday" :(day ==6)? "Saturday" : "Sunday");

    }
}
