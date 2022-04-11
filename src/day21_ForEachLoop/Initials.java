package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
        "API Testing", "Database Testing", "Manual Testing"};

        for(String eachName : names){
            String initials = eachName.charAt(0)+"."+eachName.charAt( eachName.indexOf(" ")+1);
            System.out.println( initials);
        }
    }
}
