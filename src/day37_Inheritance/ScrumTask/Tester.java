package day37_Inheritance.ScrumTask;

public class Tester extends Employee{ // Tester IS A Employee, Tester IS A Person


    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }


    public void creatingTicket(){
        System.out.println(jobTitle+ " " +name+" is creating ticket");
    }

}
/*
Tester extends Employee
			creatingTicket()
 */