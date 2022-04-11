package day16_ForLoopsStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";// "b"

        for (int i = 0; i < str.length(); i++) {// i: index numbers of str (starting from 0); If statementta ki kosul tekrar etsin diye if statement loop icine yazildi

            char ch = str.charAt(i);// this is how can I get each character of String str!!!

            if(str.indexOf(ch) == str.lastIndexOf(ch)){//This expression checks if the first and last index of the character are the same, then the character is unique
            result += ch;// kosulu gerceklestiren character sonuca eklenecek, digerleri eklenmeyecek.

            }

        }

        System.out.println(result);

    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */