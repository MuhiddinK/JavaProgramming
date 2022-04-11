package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length() ; i++) {// i: indexes of str
            char eachChar = str.charAt(i);//echChar: each character of str
            if(ch == eachChar){//if given ch is matching with the eachChar, then ch is appered in the String
                frequency++;//her tekrarda sayi 1 artacak (+1)
            }

        }

        System.out.println("frequency = " + frequency);
    }
}
/*
	1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */