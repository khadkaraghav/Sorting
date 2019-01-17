package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       String a,b,c,temp;
        Scanner key = new Scanner(System.in);

        System.out.println("Enter first letter");
        a = key.nextLine();

        System.out.println("Enter second letter");
        b = key.nextLine();

        System.out.println("Enter third letter");
        c = key.nextLine();

        if (a.compareToIgnoreCase(b) > 0){
            temp = a;
            a = b ;
            b = temp;
        }

         if (a.compareToIgnoreCase(c)>0){
          temp = a;
          a = c;
          c = temp;
}

         if (b.compareToIgnoreCase(c)>0){
         temp = b;
         b = c;
         c = temp;
}


        System.out.println("Sorted letters:" +a +"\t" +b +"\t" +c);
    }
}







