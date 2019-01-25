import java.util.Scanner;

public class Example4 {

    static int height,base;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base");
        base = scanner.nextInt();
        System.out.println("Enter the height");
        height = scanner.nextInt();

        double area = 0.5 * base * height;

        System.out.println("The area is "+area);

        int squred_hypotenuse = base*base + height*height;

        double sqrt_hypotunuse = Math.sqrt(squred_hypotenuse);

        System.out.println("The hypotunuse value is "+sqrt_hypotunuse);
    }
}
