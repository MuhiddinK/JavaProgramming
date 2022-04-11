package week09;

public class EtsySearch {
    public static void main(String[] args) {


        System.out.println("--Starting UI Automation testing for Etsy Website---");

        openBrowser("Chrome");

        navigateToUrl("http://www.etsy.com");

        searchForItem("Java");

        if(verifyItemIsDisplayed().equals("PASS")){
            System.out.println("Your test case Passed");
        }else{
            System.out.println("Failed test case scenario");
        }




    }

    public static void openBrowser(String browser){
        System.out.println("launching " +browser+ " browser");

    }


    public static void navigateToUrl(String url){
        System.out.println("navigating to "+url);
    }




    public static void searchForItem(String item){
        System.out.println("PASS: verify "+item+" exists");
        System.out.println("click on the "+item);
    }



    public static String verifyItemIsDisplayed(){
        String result = "PASS";
        return result;
    }





}
