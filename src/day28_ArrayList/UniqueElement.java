package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");
        list.add("Java");
        list.add("Java Script");
        list.add("C++");
        list.add("C++");
        list.add("Java");

        System.out.println(list);

        ArrayList<String> unique = new ArrayList<>();// unique elements will be here

        for (String each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){
                unique.add(each);
            }

        }

        System.out.println(unique);



    }

}
