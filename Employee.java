package com.bartwal;

public class Employee {
    String name = "Gagan" ;
    int age = 21;
    String city = "Delhi" ;
    public void Display () {
        Employee emp = new Employee();
        System.out.println("Name:" +emp.name) ;
        System.out.println ("Age:" +emp.age) ;
        System.out.println("City:" +emp.city);
    }
    public static void main(String[] args) {
        Employee empObj = new Employee() ;
        empObj.Display();
    }
}
