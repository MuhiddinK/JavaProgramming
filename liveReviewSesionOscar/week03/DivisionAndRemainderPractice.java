package week03;

public class DivisionAndRemainderPractice {

    public static void main(String[] args) {

        int score = 155;

        if(score>=90 && score <= 100){
            System.out.println("A");
        }else if(score <90 && score>=80){
            System.out.println("B");
        }else if(score <80 && score >=70){
            System.out.println("C");
        }else if(score <70 && score >=60){
            System.out.println("D");
        }else if(score < 60 && score >=0) {
            System.out.println("FAILED");
        }else{
            System.out.println("NOT a valid SCORE!");}

    }

}
