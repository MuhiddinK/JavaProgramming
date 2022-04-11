package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0) +""+ each.charAt(each.length()-1) );
        }
    }
}
/*
          Print the first and the last characters of each elements of these array 
 */