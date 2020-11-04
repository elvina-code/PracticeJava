package day26_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String sentence = "Today is Monday";
        System.out.println("Enter your sentence");
        String sentence = scanner.nextLine();

        String  [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reverseWord = "";
        for(int i = words.length-1; i >= 0; i --){
            reverseWord += words [i] + " "; //! --> " "

        }
        System.out.println(reverseWord.trim() + "");


    }
}
