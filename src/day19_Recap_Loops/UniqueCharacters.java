package day19_Recap_Loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //bdf

        for (int j = 0; j < str.length(); j++) {//Bu outher loop sirayla tum karakterin inner loop da karsilastirilmasini sagliyor

            // bu curly braces'in ici inner loop
            //char ch = 'a'; Bu loop inner loop olunca tum karakterler icin bu kismi asagidaki gibi degistiriyoruz
            char ch = str.charAt(j);
            int count = 0;// represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) {//this loop gets every single character from str
                char each = str.charAt(i);// i: to compare every single character to each character to count the frequency
                if(ch == each){// if the characters are the same
                    count++;// count one by one
                }
            }
            //We placed this if statement in the outer loop because inner loop counts the frequency and outer loop pick the unique characters
            if( count == 1){// if the frequency is equal to 1, then the character is unique
                result += ch;

            }
        }

        System.out.println(result);

    }
}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */
/*
        THIS IS HOW WE CAN FIND FREQUENCY OF ONE CHARACTER OF THE STRING. TO OTHERS WE HAVE TO USE ANOTHER LOOP(nested)
        char ch = 'a';
        int count = 0;// represents the frequency of the ch
        for (int i = 0; i < str.length(); i++) {//this loop gets every single character from str
            char each = str.charAt(i);
            if(ch == each){
                count++;

                }
        }
        System.out.println(count);
 */