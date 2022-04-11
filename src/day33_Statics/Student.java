package day33_Statics;

public class Student {

    public String name;
    public char gender, grade;
    public int age, studentID;


    public Student(String name) {
        this.name = name;
    }


    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }


    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, char grade, int age, int studentID) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }
}


/*
Warmup tasks:

	Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				1 Add a constructor that allows user to create object by setting the name of student

				2 Add a constructor that allows user to create object by setting the name and gender of the student

				3 Add a constructor that allows user to create object by setting the name and studentID of the student

				4 Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				5 Add a constructor that allows user to create object by setting the name, gender and age of the student

				6 Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

				7 Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()

 */