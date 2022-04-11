package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 975, "white");



        Samsung samsung = new Samsung("Galaxy", "6 inches", 900, "black");



        Nokia nokia = new Nokia("Brick", "4 inches", 50, "gray");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


        iphone.call(911);
        iphone.text(123345567);
        iphone.faceTime("yah@yahoo.mail");
        iphone.faceTime(1233456677);

        System.out.println("-----------------------------------");

        samsung.call(911);
        samsung.text(123345567);
        samsung.freeze();


        System.out.println("------------------------");

        nokia.selfDefense();
        nokia.call(1234566);


        System.out.println("------------------------");

        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);






    }
}
