package day29_ArrayList2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        // we want to retain only "David" and "Ahmed"
        employees.addAll( Arrays.asList("Ali", "David", "Ahmet", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll( Arrays.asList("Ahmed", "David"));

        System.out.println(employees);


        System.out.println("-----------------------------------------------------");


        String[] names = {"Mary", "Monica", "Mehray", "Muti", "Sema", "Hasan", "Beril"};

        ArrayList<String> listNames = new ArrayList<>( Arrays.asList(names));

        listNames.removeIf( p-> p.charAt(0) == 'M' ); // or we can use startWith method

        System.out.println(listNames);

        names = listNames.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


        System.out.println("------------------------------------------------------------");


    }
}
