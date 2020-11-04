package day26_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/*
 	FrequencyOfEachChars
 	1. write a program that can return the frequency of characters from a String
 			Ex:
 				str = "ababaac";

 				output:
 					a3b2c1
  */
public class FrequencyOfEachChars {
    public static void main(String[] args) {
        String str = "aaabbc";// "a3b2c1"

        String nonDup = ""; // "abc"
        //     str = str.replace(" ",""); // if we need to ignore the spaces

        for(int i =0; i <str.length(); i++){ //i: 0,1,2,3,4,5
            String eachChar = "" + str.charAt(i); // a, a, a, b, b, c
            if(!nonDup.contains(eachChar)){
                nonDup +=eachChar;
            }
        }

        String result = "";  // "a3b2c1"
        for(int j = 0; j < nonDup.length(); j++){ // j is the index num of nonDup

            char ch = nonDup.charAt(j); // a, b, c

            int count =0;
            for(int i =0; i< str.length(); i++){ // i is the index num of original string
                char eachChar = str.charAt(i); // a, a, a, b, b, c
                if(ch == eachChar){
                    count++;
                }
            }

            result += "" + ch + count;
        }
        System.out.println(result);
    }


}
