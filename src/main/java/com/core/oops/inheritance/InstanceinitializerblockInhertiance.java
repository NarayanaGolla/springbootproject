package com.core.oops.inheritance;
class A{
    A(){
    System.out.println("parent class constructor invoked");
}
}
public class InstanceinitializerblockInhertiance extends A{
    InstanceinitializerblockInhertiance(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]) {
        InstanceinitializerblockInhertiance b = new InstanceinitializerblockInhertiance();
    }
}

/*

Output:
parent class constructor invoked
instance initializer block is invoked
child class constructor invoked

 */