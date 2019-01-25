package data;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args){
        System.out.println("enter the radius");
        int radius = new Scanner(System.in).nextInt();
        Area area = new Area(radius);

        double circle = area.AreaOfACircle();

        System.out.println("Area is "+circle);
    }
}
