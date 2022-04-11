package day32_Constructor_Overloading;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");
        Employee employee2 = new Employee("Anna", 'F');
        Employee employee3 = new Employee("Ali", 'M', "SDET");
        Employee employee4 = new Employee("Muti", 'M', "SDET", 120000);


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }



}
