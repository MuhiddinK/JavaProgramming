package week04;

public class VendingMachine {

    public static void main(String[] args) {

        String selection = "candy";
        String drinkItem = "coffee";
        String snackItem = "chips";

        //Notes on String equality: we will not use "==" sign for String equality,

        if(selection == "drink"){
            System.out.println("drink option is selected");
            if(drinkItem == "tea"){
                System.out.println("tea selected");
            }else if(drinkItem == "coffee"){
                System.out.println("coffee selected");
            }
        }else if(selection == "snack"){
            System.out.println("snack selected");
            if(snackItem == "chips"){
                System.out.println("chips selected");
            }else if(snackItem == "candy"){
                System.out.println("candy selected");
            }


        }else{
            System.err.println("INVALID ENTRY");
        }
    if(false)
        System.out.println("hello");
        System.out.println("NOOO");

    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
 */