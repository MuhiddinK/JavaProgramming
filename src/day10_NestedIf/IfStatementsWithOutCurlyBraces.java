package day10_NestedIf;

public class IfStatementsWithOutCurlyBraces {

    public static void main(String[] args) {

        int number = 12;
        String result = "";//temporary value assigned

        if(number >=1 && number <=12){//if the number is valid (1~12)

            if(number == 1)//if there are a lot of if statementd under one condition you can not use curly braces BUT IT IS NOT RECOMMENDED!!!
                result = "January";
            else if(number ==2)
                result = "February";
            else if(number ==3)
                result = "March";
            else if(number ==4)
                result = "April";
            else if(number ==5)
                result = "May";
            else if(number ==6)
                result = "June";
            else if(number ==7)
                result = "July";
            else if(number ==8)
                result = "August";
            else if(number ==9)
                result = "September";
            else if(number ==10)
                result = "October";
            else if(number ==11)
                result = "November";
            else
                result = "December";


        }else{
            result = "Invalid";
        }


        System.out.println("result = " + result);




    }

}