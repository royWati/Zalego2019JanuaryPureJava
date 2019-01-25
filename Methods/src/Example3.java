import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Example3 {

    public static void main(String [] args){
        int height;
        int length;
        int hypotenuse;
        System.out.println("Enter height");
        height = new Scanner(System.in).nextInt();
        System.out.println("Enter length");
        length = new Scanner(System.in).nextInt();
        hypotenuse = gethypotenuse(height,length);
        System.out.println("The length of the slide is "+hypotenuse);
    }
    public static int gethypotenuse(int height, int length){
       int hypotenuse;
       hypotenuse = (int)sqrt((height*height)+(length*length));
       return hypotenuse;
    }
}
