package com.bridgelab;

import java.util.Scanner;

public class LineComparision {
    public static void lineDistance() {
        int x1,x2,y1,y2;
        double distance;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of x1,x2,y1,y2 points:");
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        distance=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+"is"+" " + distance);
    }
}
