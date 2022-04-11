package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        // 3 testers objects
        Tester tester1 = new Tester("Mehmet", 11, "QA", 110000);
        Tester tester2 = new Tester("Emre", 13, "SDET", 120000);
        Tester tester3 = new Tester("Muti", 15, "QA", 130000);
        Tester tester4 = new Tester("Muco", 17, "SE", 140000);


        Tester[] testers = {tester2, tester3, tester4};


        //4 developers objects
        Developer developer1 = new Developer("Olga", 21, "Java Developer", 125000);
        Developer developer2 = new Developer("Ali", 23, "Java Master", 135000);
        Developer developer3 = new Developer("Ayse", 25, "Software Developer", 155000);
        Developer developer4 = new Developer("Osman", 27, "Senior Developer", 155000);

        Developer[] developers = {developer2, developer3, developer4};


        // 1 scrumTeam object
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huso", "Neira", 14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);


        System.out.println("-------------------------------------------------------------");


        for (Tester eachTester : scrum.testersList ) {
            System.out.println( eachTester.name + " : " + eachTester.salary);
        }


        System.out.println("-------------------------------------------------------------");


        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println( eachDeveloper.name + " : " + eachDeveloper.salary );
        }


        System.out.println("-------------------------------------------------------------");


        scrum.removeTester(11);
        scrum.removeDeveloper(21);


        System.out.println(scrum);
        
    }

}

/*
create a class called MyScrumTeam:

	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */