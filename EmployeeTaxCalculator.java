package com.bartwal;

import java.util.Scanner;

public class EmployeeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = new String();
        int Yob, Mob, Dob, Age, Salary;
        float Tax = 0.0F;
        System.out.println("Employee's Tax Calculator:-");
        System.out.println("Enter your name:");
        Name = sc.nextLine();
        System.out.println("Enter your Date of Birth :-");
        System.out.println("Year of Birth:");
        Yob = sc.nextInt();
        System.out.println("Month of Birth");
        Mob = sc.nextInt();
        System.out.println("Date of Birth:");
        Dob = sc.nextInt();
        System.out.println("Enter your salary(p.a):");
        Salary = sc.nextInt();
        Age = 2020 - Yob;
        if (Salary > 500000){
            Tax = (20*Salary)/100;
        }
        else if (Salary > 400000){
            Tax = (15*Salary)/100;
        }
       else if (Salary > 300000){
           Tax = (10*Salary)/100;
        }
       else if (Salary > 200000){
           Tax = (5*Salary)/100;
        }
        System.out.println("Name :"+Name);
        System.out.println("Age :"+Age);
        System.out.println("Your Salary :"+Salary);
        System.out.println("Calculated Tax amount :"+Tax);
    }
}
