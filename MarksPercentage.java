package com.bartwal;

import java.util.Scanner;

public class MarksPercentage {
    public static void main(String[] args) {
        int Physics, Chemistry, Maths, CScience, English;
        float Marks, Percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter 5 subject marks (out of 100):-");
        System.out.println("Physics Marks:");
        Physics = sc.nextInt();
        System.out.println("Chemistry Marks:");
        Chemistry = sc.nextInt();
        System.out.println("Maths Marks:");
        Maths = sc.nextInt();
        System.out.print("Computer Science Marks:");
        CScience = sc.nextInt();
        System.out.println("English Marks:");
        English = sc.nextInt();
        Marks = Physics + Chemistry + Maths + English + CScience;
        Percentage = Marks/5;
        if (Percentage >90) {
            System.out.println("You've got " + Percentage + "%:Grade A ");
        }
        else if ( Percentage > 75){
            System.out.println("You've got " + Percentage + "% = Grade B");
        }
        else if(Percentage > 60) {
            System.out.println("You've got " + Percentage + "% = Grade C");
        }
        else if ( Percentage > 45){
            System.out.println("You've got " +Percentage + "%= Grade D");
        }
        else if (Percentage > 33){
            System.out.println("You've got " +Percentage + "%= Grade E");
        }
        else if (Percentage < 33){
            System.out.println("You've got " +Percentage + "%= Fail");
        }
    }

}
