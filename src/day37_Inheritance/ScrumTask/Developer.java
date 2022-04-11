package day37_Inheritance.ScrumTask;

public class Developer extends Employee{ // Developer IS A Person, Developer IS A Employee

    public Developer(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }


    public void fixBugs(){
        System.out.println(jobTitle+ " " +name+" is fixing bugs");
    }

}
/*
Developer extends Employee
			fixBugs()
 */