package day37_Inheritance.phoneTask;

public class Phone {

    public String brand, model, size;
    public double price;
    public String color;

    public static boolean hasBattery = true; // if we need additional steps to set static variable the best wat is to use a static block


   // static {
   //     hasBattery = true;
   // }



    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        // hasBattery = true; this code executed one time and it is enough, if we assign in the constructor this code will be executed hundreds of times for nothing§
        // so we should never assign a static value in the constructor!!!!!!!!!!
    }


    public void call(long phoneNumber){
        System.out.println(brand+ " " +model+" is calling "+phoneNumber);
    }


    public void text(long phoneNumber){
        System.out.println(brand+ " " +model+" is texting "+phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", hasBattery='" + hasBattery + '\'' +
                '}';
    }



}
/*
    class : Phone
                        Variables:
                                brand, model, size, price, color

                        Add constructor

                        Methods:
                                call(long phoneNumber)
                                text(long phoneNumber)
                                toString()

 */
