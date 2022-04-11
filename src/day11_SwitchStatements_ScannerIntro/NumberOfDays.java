package day11_SwitchStatements_ScannerIntro;

public class NumberOfDays {

    public static void main(String[] args) {

        int year = 2000;
        int number = 9;
        //String result "";

        if(number >=1 && number <= 12) {

            switch (number){

                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 days");
                    }else{
                        System.out.println("28 days");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;

                default://1, 3, 5, 7, 8, 10, 12
                    System.out.println("31 days");

            }




        }else{
            System.out.println("Invalid Number");
        }








    }
}
