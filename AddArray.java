package com.bartwal;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int ans=0;
        Scanner SC = new Scanner (System.in);
        System.out.println("Enter 5 elements for array:");
        for (int i=0; i<5; i++){
            arr[i] = SC.nextInt();
        }
        System.out.println("Sum of array elements:-");
        for(int i=0; i<5; i++){
            ans = ans + arr[i];
            }
        System.out.println(ans);
    }
}
