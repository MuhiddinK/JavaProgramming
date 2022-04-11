package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        /*

         */
        int score = 85;

        if(score >= 0 && score <=100){//if the score is valid there are 5 possibilities(A,B,C,D;F)

            if(score >= 90) {
                System.out.println("A");
            }else if(score >=80){
                System.out.println("B");
            }else if(score >=70){
                System.out.println("C");
            }else if(score >=60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }





        }else{//if the score is not valid there is only one possibility!!!
            System.out.println("Invalid Score");}
        System.out.println("-------------------------------------------");


        String result = "";//temporary

        if(score >= 0 && score <=100){//if the score is valid there are 5 possibilities(A,B,C,D;F)

            if(score >= 90) {
                result ="A";
            }else if(score >=80){
                result ="B";
            }else if(score >=70){
                result ="C";
            }else if(score >=60){
                result ="D";
            }else{
                result ="F";
            }





        }else{//if the score is not valid there is only one possibility!!!
            System.out.println("Invalid Score");}

        System.out.println("result = " + result);
    }
}
