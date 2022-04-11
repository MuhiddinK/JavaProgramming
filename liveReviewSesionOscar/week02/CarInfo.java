package week02;

public class CarInfo {

    public static void main(String[] args) {

        int year = 2022;
        String make = "Audi";
        String model = "Q7";
        // automatic = true; manual = false;
        boolean transmission = true;
        String color = "black";
        int milage = 0;
        int price = 75_000; //for europe
        System.out.println(year+" "+make+" "+model+"\nAutomatic Transmission :"+transmission);
        System.out.println(color+" "+milage+" kilometers "+price+" Euros");
        // lets turn this value into TL: 1 Euro = 15.5)

        double priceInTL = price * 15.5;

        double taxRate = 1.80;

        double priceAfterTaxInTL = priceInTL+ priceInTL*taxRate;

        System.out.println("priceAfterTaxInTL= " + priceAfterTaxInTL);





    }


}
