package day09_IfStatements2;

public class NameOfDay {

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

        String day = "n";

        if(n == 1) {
            day = "Monday";
        }else if(n == 2){
            day = "Tuesday";
        }else if(n == 3) {
            day = "Wednesday";
        }else if(n == 4) {
        day = "Wednesday";
    }else if(n == 5) {
        day = "Wednesday";
        }else if(n == 6) {
        day = "Wednesday";
        }else if(n == 7) {
        day = "Wednesday";
        }
        System.out.println("day= "+day);

    }
}
