import java.util.Scanner;

public class Example2 {

    static int a,b;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number 1");
        a = scanner.nextInt();

        System.out.println("Enter number 2");
        b = scanner.nextInt();

        int answer =a + b;
        System.out.println("The addition is "+answer);
        System.out.println("The subtraction is "+answer);
        System.out.println("The multiplication is "+answer);
        System.out.println("The division is "+answer);
        System.out.println("The modulus is "+answer);
    }
}
