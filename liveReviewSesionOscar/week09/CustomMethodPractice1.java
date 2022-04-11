package week09;

public class CustomMethodPractice1 {

    public static void main(String[] args) {

        int personOneAge = 10;
        if(personOneAge>=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }


        int personTwoAge = 20;
        if(personTwoAge>=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }


        int personThreeAge = 30;
        if(personThreeAge>=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }

        System.out.println("----------------------------------------------");

        eligibleOrNot(personOneAge);
        eligibleOrNot(personTwoAge);
        eligibleOrNot(personThreeAge);
        eligibleOrNot(45);

    }

    public static void eligibleOrNot(int age){
        if(age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }

}
