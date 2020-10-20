package com.bartwal;

import java.util.Scanner;

public class Avengers {
    String name = new String ();
    String power = new String();
    String weapon = new String();
    String planet = new String();
    int age;
    public void getDetails (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the avenger:");
        name = sc.nextLine();
        System.out.println("Enter the age of the avenger:");
        age = sc.nextInt();
        System.out.println("Enter the power of avenger:");
        sc.nextLine();
        power = sc.nextLine();
        System.out.println("Enter the name of weapon:");
        weapon = sc.nextLine();
        System.out.println("Enter the name of the planet:");
        planet = sc.nextLine();
    }
    public void displayDetails(){
        System.out.println("Name of the avenger:" + name);
        System.out.println("Age of the avenger:" + age);
        System.out.println("Powers of the avenger:" + power);
        System.out.println("Weapon of the avenger:" + weapon);
        System.out.println("Planet of the avenger:" + planet);
    }
    public static void main(String[] args) {
        Avengers avenger1 = new Avengers();
        avenger1.getDetails();
        avenger1.displayDetails();
        Avengers avenger2 = new Avengers();
        avenger2.getDetails();
        avenger2.displayDetails();
        Avengers avenger3 = new Avengers();
        avenger3.getDetails();
        avenger3.displayDetails();
        Avengers avenger4 = new Avengers();
        avenger4.getDetails();
        avenger4.displayDetails();
        Avengers avenger5 = new Avengers();
        avenger5.getDetails();
        avenger5.displayDetails();
    }
}
