package day09_IfStatements2;

public class MedianNumber {

    public static void main(String[] args) {

        int a= 10,
                b = 15,
                c = 20;

        boolean aIsMedianNumber = (a > b && a < c) || (a < b && a > c);
        boolean bIsMedianNumber = (b > a && b < c) || (b < a && b > c);
        boolean cIsMedianNumber = (c > a && c < b) || (c < a && c > b);// boolean cIsMedianNumber = !aIsMedianNumber && !bIsMedianNumber;

        if(aIsMedianNumber){

            System.out.println(a+ " is the median number.");
        }

        if(bIsMedianNumber){

            System.out.println(b+ " is the median number.");
        }

        if(cIsMedianNumber){

            System.out.println(c+ " is the median number.");
        }



    }

}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number

			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */