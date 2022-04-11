package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110_000;



        Employee employee2 = new Employee();
        employee2.name = "Ali";
        employee2.salary =120000;

        System.out.println(employee1.name+ " : " +employee1.salary + " : " +employee1.companyName );
        System.out.println(employee2.name+ " : " +employee2.salary + " : "+ employee2.companyName );





    }


}
