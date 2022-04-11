package day34_Static_Garbage_AccesModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){ // instance
        this.studentName = studentName;
    }

    static {
        schoolName = "Cydeo School";// static
    }

}





class CydeoStudentObject{

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Cathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }
}
