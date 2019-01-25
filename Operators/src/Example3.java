import java.util.Scanner;

public class Example3 {
    static int a , b;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b=scanner.nextInt();

        float ans = (float) ((double) a/ (double) b);

        System.out.println("Ans = "+ans);


    }
}
