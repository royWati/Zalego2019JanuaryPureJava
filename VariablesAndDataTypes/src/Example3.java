import java.util.Scanner;

public class Example3 {

    public static void main(String[] args){
        int a;
        short b;

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("enter a");
        a= scannerObj.nextInt();
        System.out.println("enter b");
        b=scannerObj.nextShort();
        System.out.println("a is : "+ a);
        System.out.println("b is :"+b);

    }
}
