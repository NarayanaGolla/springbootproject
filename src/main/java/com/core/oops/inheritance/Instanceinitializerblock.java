package com.core.oops.inheritance;



public class Instanceinitializerblock {

    int speed;

    //default constructor
    Instanceinitializerblock(){
        System.out.println("speed is "+speed);
    }



    //inilialsizer block
    {speed=100;}

    public static void main(String args[]){
        Instanceinitializerblock b1=new Instanceinitializerblock();
        Instanceinitializerblock b2=new Instanceinitializerblock();
    }
}

/*
1. Inialsozer block
2.Controctor
Output:speed is 100
speed is 100
 */