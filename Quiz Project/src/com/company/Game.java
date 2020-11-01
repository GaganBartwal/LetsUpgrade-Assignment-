package com.company;

import java.util.Scanner;

public class Game {
    Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctAnswer,userAnswer;

    public boolean askQuestion()
    {
        System.out.println("\n" +question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.print("Please Enter an Option:");
        userAnswer=sc.nextInt();
        return userAnswer==correctAnswer;
    }
}
