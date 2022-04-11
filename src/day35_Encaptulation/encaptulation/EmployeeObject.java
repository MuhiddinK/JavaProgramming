package day35_Encaptulation.encaptulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andi", 'F', 28, 120000);

        System.out.println(employee1);


        employee1.setAge(33);

        System.out.println(employee1);


        Employee employee2 = new Employee("Muti", 'M', 45, 130000);

        System.out.println(employee2);

        employee2.setSalary(140000);

        System.out.println(employee2);

    }

}
