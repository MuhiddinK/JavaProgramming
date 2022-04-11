package day29_ArrayList2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        // addAll(CollectionType)
        // asList()

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(list);


        // removeAll(CollectionType) : removes all the matching elements

        list.removeAll(Arrays.asList(1,3,5,7,9));// specify the elements wanted to remove

        System.out.println(list);

        System.out.println("---------------------------------");


        // retainAll(CollectionType) : removes all the NOT Matching elements

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));

        numbers.retainAll(Arrays.asList(100,200,300));

        System.out.println(numbers);

        System.out.println("---------------------------------");


        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "MA", "PO", "SM"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));

        System.out.println(jobTitles);

        System.out.println("----------------------------------");


        // containsAll(CollectionType)

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1 = nums.contains(10);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);

        boolean r3 = nums.containsAll( Arrays.asList(2,5,10));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);


        System.out.println("-----------------------------------------------------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};


       // ArrayList<String> namesList = new ArrayList<>();
       // namesList.addAll( Arrays.asList(names)); converted the primitive(Array) to the non-primitive(ArrayList)


        ArrayList<String> namesList = new ArrayList<>( Arrays.asList(names)); // converted the primitive(Array) to the non-primitive(ArrayList)

        System.out.println(namesList);

        System.out.println("------------------------------------------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};// CANNOT be converted to the ArrayList!!!!

        Integer[] ar = {1,2,3,4,5,6,7,8,9,10}; // can be converted to the ArrayList

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(ar));

        System.out.println(list2);

        System.out.println("-----------------------------------------------------------------");


        int[] ar3 = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> list3 = new ArrayList<>( convertArrayYoArrayList(ar3));

        System.out.println("list3 = " + list3);




    }

    // convert Array to ArrayList
    public static ArrayList<Integer> convertArrayYoArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;

    }
}
