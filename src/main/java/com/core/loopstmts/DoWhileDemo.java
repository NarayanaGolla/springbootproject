package com.core.loopstmts;

import java.util.ArrayList;
import java.util.List;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        }while(i<=10);


        i=1;
        while(i<=10) {
            System.out.println(i);
            i = i + 2;
        }

        for( i=2 ; i<=10 ; i++) {
            System.out.println(i);
        }

        List<String> list = new ArrayList<>();
        list.add("1");

        for(String str : list){
            System.out.println(str);
        }



    }
}
