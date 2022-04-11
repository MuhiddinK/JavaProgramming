package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,20,10,60,70,10,20,10));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int frequency = Collections.frequency(list, each);
            if(frequency == 1){
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,20,10,60,70,10,20,10));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);// add all the elements of list2

        unique2.removeIf( p -> Collections.frequency(list2, p) > 1);// remove if the frequency greater than 1

        System.out.println("unique2 = " + unique2);




    }
}
