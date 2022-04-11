package day35_Encaptulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStady;

    public static String programmingLanguage;
    public static String schoolName;
    public static String secretCode;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStady) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStady = fieldOfStady;
    }

    static {
        schoolName = "CYDEO";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";

    }

    public static void printProgrammingLanguage(){
        System.out.println("Programming Language is " + programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("School is " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret code is " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class.");
    }

    public void study(){
        System.out.println(name + " is studying.");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStady='" + fieldOfStady + '\'' +
                ", school='" + schoolName + '\'' +
                ", language='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */