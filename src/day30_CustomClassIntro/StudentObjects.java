package day30_CustomClassIntro;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2211, 'B');

        Student student3 = new Student();
        student3.setInfo("Arya", 'F', 26, 2212, 'C');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M', 29, 2213, 'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 23, 2214, 'A');


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("------------------------------------------------------------");


        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade : A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);

        System.out.println(angryBirds);




    }
}
