package day24_CustomMethod_Return;

public class Return_vs_SytemExit_Method {

    public static void main(String[] args) {

        nameOfMonths(50);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonths(int number) {

        if (number < 1 || number > 12) {
            System.out.println("invalid");
            //return;//exits nameOfMonth method
            System.exit(0); // all of the program will be terminated
        }

        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "Mai"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";


        System.out.println("Month name = " + name);

    }

}
