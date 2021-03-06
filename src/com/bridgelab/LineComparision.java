package com.bridgelab;
import java.util.Scanner;
public class LineComparision {
    /**
     * calculates the distance between two points and comparing the two distances.
     */
    public  void lineDistance() {
        int x1,x2,y1,y2;
        int p1,p2,q1,q2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the values of x1,x2,y1,y2 points:");
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        System.out.println("enter p1,p2,q1,q2 point:");
        p1=sc.nextInt();
        p2=sc.nextInt();
        q1=sc.nextInt();
        q2=sc.nextInt();
        Double distanceOne=Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        Double distanceTwo=Math.sqrt(Math.pow(p2-p1,2)+ Math.pow(q2-q1,2));
        System.out.println("distance between"+"("+p1+","+q1+"),"+"("+p2+","+q2+")"+"is"+" " + distanceOne);
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")"+"is"+" " + distanceTwo);
        int val = distanceOne.compareTo(distanceTwo);
        if (val > 0) {
            System.out.println("distance1 is greater than distance2");
        } else if (val < 0) {
            System.out.println("distance1 is less than distance2");
        } else {
            System.out.println("distance1 is equal to distance2");
        }
    }
    public static void main(String[] args) {
        LineComparision linecomparision = new LineComparision();
        linecomparision.lineDistance();
    }
}
