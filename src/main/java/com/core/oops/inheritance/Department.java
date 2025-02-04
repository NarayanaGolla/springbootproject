package com.core.oops.inheritance;

//child
public class Department extends Employee implements EmployeeInterface{

    //contructor

    public Department() {
        System.out.println("Depart constructor");
    }


    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public void show() {

    }
}
