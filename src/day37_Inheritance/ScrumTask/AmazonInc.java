package day37_Inheritance.ScrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Muti", 45, 'M', 1, 160000, company );

        BusinessAnalyst ba = new BusinessAnalyst("Anna", 35, 'F', 2, 150000, company );

        ScrumMaster sm = new ScrumMaster("Adel", 25, 'F', 3, 120000, company );

        Tester tester1 = new Tester("Canan", 32, 'F', "QA", 4, 130000, company);
        Tester tester2 = new Tester("Handan", 42, 'F', "QE", 5, 135000, company);
        Tester tester3 = new Tester("Yandan", 22, 'F', "SDET", 6, 120000, company);

        Tester[] testers = { tester1, tester2, tester3};

        Developer developer1 = new Developer("Emre", 33, 'M', "Java Developer",7, 135000,company );

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);


        System.out.println("--------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" : "+tester.salary);
        }











    }






}
