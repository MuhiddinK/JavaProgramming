package day09_IfStatements2;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2022;

        boolean leapYear = year % 4 == 0;

        if(leapYear) {
            System.out.println("Year "+year+" is a leap year.");
        }else {
            System.out.println("Year " + year + " is not a leap year.");
        }
    }
}
