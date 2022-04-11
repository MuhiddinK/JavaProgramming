package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);// 0
        numbers.add(20);// 1
        numbers.add(10);// 2
        numbers.add(10);// 3
        numbers.add(40);// 4
        numbers.add(50);// 5

        numbers.add(2,25);// 2

        System.out.println(numbers);


        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println(lastIndex);

        Integer index3 = numbers.get(3);

        System.out.println(index3);

        System.out.println("----------------------------------------");


        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i)); // gets all of the elements
        }


        System.out.println("--------------------------------------------------");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript");// replace the elements


        System.out.println(list);


        System.out.println("---------------------------------------------");


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Suvi");
        employees.add("Suna");
        employees.add("Olga");
        employees.add("Ali");
        employees.add("Veli");
        employees.add("Deli");
        employees.add("Koray");

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(0);

        System.out.println(employees);

        employees.remove(employees.size() -1);

        System.out.println(employees);

        employees.remove("Veli");

        System.out.println(employees);






    }

}
