package day37_Inheritance.ScrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "product Owner", id, salary, companyName);
    }

    public void gatheringRequirements(){
        System.out.println(name+ " is gathering requirements");
    }

}
