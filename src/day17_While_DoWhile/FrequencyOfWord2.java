package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "Cat Cat Dog Dog cAt CAt caT";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) {// eachSub icin +3 bitis indexi verdigimiz icin burada length' den 3 cikariyoruz ki hata vermesin!
            String eachSub = str.substring(i, i+3);// kelimenin 3 harfli oldugu icin i+3 yazdik ve total index nedeniyle hata vermemesi icin yukarida length -3 yazdik
            // System.out.println(eachSub);

            if(eachSub.equalsIgnoreCase("cat")){// case insensitive (equalsIgnore method)
                frequency++;
            }

        }

        System.out.println(frequency);

    }
}
