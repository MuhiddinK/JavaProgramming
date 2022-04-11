package day36_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Muti", 27,'M','A',"cydeo");

        System.out.println(student1);

        student1.setAge(45);

        System.out.println(student1);



    }
}
