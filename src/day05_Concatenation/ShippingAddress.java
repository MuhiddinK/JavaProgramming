package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
// We can use multiples variables if the dtq types are the same!!!

        String name = "Poul Will",
               buildingNumber = "1123B",
               streetName = "Knob Hill",
                city = "Lansing",
                state = "Michigan",
                zipCode = "34567B";


        /*System.out.println(name + "\n" + buildingNumber+ " " + streetName
                + "\n" + city +", " + state +" " + zipCode); */

        String address = name + "\n" + buildingNumber+ " " + streetName + "\n" + city +", " + state +" " + zipCode;

        System.out.println(address);













    }



}
