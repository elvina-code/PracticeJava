package day26_Arrays;

import java.util.Arrays;

public class ArrayDescending {
    public static void main(String[] args) {
        int [] arr = {1,3,6,8,3,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] descend = new int [arr.length];
        for(int i = arr.length-1, j = 0; i >= 0 ; i --, j++){

                descend [j] = arr[i];

            }

        System.out.println(Arrays.toString(descend));
    }
}
