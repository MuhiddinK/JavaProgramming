package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(6,7,8,9,1,4,5,2,3));

        Collections.sort(list);

        System.out.println(list);

        System.out.println("-----------------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));

        System.out.println(list2);

        Collections.reverse(list2);

        System.out.println(list2);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3, 4, 1); // swap the elements index 1 and index 4

        System.out.println(list3);

        System.out.println("-------------------------------------");


        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.println("-----------------------------------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,40,10,60,70,10,40,10));

        Collections.replaceAll(list4,10,1000);

        System.out.println(list4);


        System.out.println("-----------------------------------------------------------------");


        ArrayList<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(10,20,30,20,10,60,70,10,20,10));

        int frequency = Collections.frequency(list5, 10);

        System.out.println("frequency = " + frequency);



        System.out.println("-----------------------------------------------------------------");


        ArrayList<Integer> list6 = new ArrayList<>();
        list6.addAll(Arrays.asList(10,20,30,20,10,60,70,10,20,10));

        int count10 = Collections.frequency(list6,10);
        int count20 = Collections.frequency(list6,20);

        System.out.println("count10 = " + count10);
        System.out.println("count20 = " + count20);


        System.out.println("-----------------------------------------------------------------");



    }
}
