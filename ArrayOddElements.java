package com.bartwal;

import java.util.Scanner;

public class ArrayOddElements {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner SC = new Scanner( System.in);
        System.out.println("Enter 5 elements for array;");
        for(int i=0; i<5; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println("Odd elements in array:-");
        for(int i=0; i<5; i++){
            if (arr[i] % 2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
