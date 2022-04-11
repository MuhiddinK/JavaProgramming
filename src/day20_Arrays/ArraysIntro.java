package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro<sout> {

    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names
        String[] myGroup = new String[5];//we know the numbers but the names!!! When we do not know what are the elements are, we use this assining method
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup[4] = "Mikael";

        //myGroup[5] = "Muhtar";

        //System.out.println(myGroup);// hashcode
        System.out.println(Arrays.toString(myGroup));// ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("___________________________________________");

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        //Index:           0      1       2     3      4      5       6   // each index number = number - 1
        //Number:          1      2       3     4      5      6       7

        System.out.println(Arrays.toString(days));

        int number = 1;

        if(number < 1 || number > 7){
            System.err.println("invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);

    }
}
