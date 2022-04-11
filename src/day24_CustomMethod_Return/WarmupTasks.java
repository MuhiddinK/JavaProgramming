package day24_CustomMethod_Return;

public class WarmupTasks {

    public static void main(String[] args) {

        initials("Muhiddin", "Karatas");// M.K

        System.out.println("--------------------------------");

        domain("mutu@gmail.com");

        System.out.println("------------------------------");

        String[] emails = {"josh@gmaol.com", "jim@hotmail.com", "elif@yahoo.com"};// custom loop icinde tekrar calisiyor

        for (String email : emails) {// each loop
            domain(email);            // our custom
        }

        System.out.println("-------------------------------");

        nameOfMonths(99);


    }

    // 1. Create a method that can display the initials of the person.     initials(String firstName, String LastName), we need names,
    public static void initials(String firstName, String lastName) {


        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);


    }

    // 2. Create a method that can display the domain of the email.        domain(String email address)
    public static void domain(String emailAddress) {

        String domain = emailAddress.substring(emailAddress.indexOf("@") + 1, emailAddress.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonths(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "Mai"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "invalid";
        }

        System.out.println("Month name = " + name);

    }

    // 4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){



    }

    // 5. Create a method that can print how many days a month has


}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */
