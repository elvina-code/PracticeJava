package day26_Arrays;


import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String str = "abcde";
        String str2 = "abdce";
        char [] array = str.toCharArray();
        char [] array2 = str2.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        boolean isAnagram = Arrays.equals(array,array2);
        System.out.println(isAnagram);
    }



}
