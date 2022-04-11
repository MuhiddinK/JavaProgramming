package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Ali", 'M');

        Student student3 = new Student("Nigara", 'F', 9);

        Student student4 = new Student("Muti", 'M', 41, 11);

        Student student5 = new Student("Sevda", 'F','A', 39, 13);




        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);


        System.out.println(student1 == student2);

        Student[] students = {student1, student2, student3, student4, student5};

        System.out.println(Arrays.toString(students) );




    }


}
