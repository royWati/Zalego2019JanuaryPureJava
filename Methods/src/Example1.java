import java.util.Scanner;

public class Example1 {

    public static void main(String[] args){

        double area = areaOfACircle();

        int r = new Scanner(System.in).nextInt();
        double area1 = Area(r);

//        System.out.println(area);
        System.out.println(area1);

    }

    public static double areaOfACircle(){
        double area = 3.14257 * 14 * 14;
        return  area;
    }

    public static double Area(int radius){
        double area = 3.14257 * radius * radius;
        return area;
    }

    public static int AreaOfARectangle(int length,int width){
        int area = length * width;
        return area;
    }

}
