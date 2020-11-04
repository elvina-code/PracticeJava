package day26_Arrays;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        double [] num = new double[length];
        for(int i = 0; i <length; i++){
            System.out.println("enter a number");
            num [i] = scan.nextDouble();
        }

        double max = num [0];
        double min = num [0];

        for(int i = 0; i < length; i++){
            if(num[i] > max){
                max = num[i];
            }
            if(num[i]< min){
                min = num[i];
            }
        }
        System.out.println("max " + max);
        System.out.println("min " + min);


    }
}
