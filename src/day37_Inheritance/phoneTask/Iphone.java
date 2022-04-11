package day37_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone(String model, String size, double price, String color) {// ONLY ONE constructor
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" "+" is having a Face Time with phone number: "+phoneNumber);
    } // instance method1

    public void faceTime(String email){
        System.out.println(brand+" "+model+" "+" is having a Face Time with email: "+email);
    } // instance method2



}
/*
 subclass : Iphone
                        Variables:
                                brand, model, size, price, color



                        Methods:
                                call(long phoneNumber)
                                text(long phoneNumber)
                                faceTime(long phoneNumber)
                                faceTime(String email)
                                toString()
 */