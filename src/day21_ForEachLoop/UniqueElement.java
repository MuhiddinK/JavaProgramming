package day21_ForEachLoop;

public class UniqueElement {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python" };

        for (String each : words) { // each represents : "Java", "Java", "C#", "Python", "Python"

            int count = 0;

            for (String element : words) { //element represents : "Java", "Java", "C#", "Python", "Python"
                if(element.equals(each)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }

        }
    }
}
