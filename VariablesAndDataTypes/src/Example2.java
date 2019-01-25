import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){
        // local variable
        int number;

        Scanner scannerObj = new Scanner(System.in);
        /* Instantiation
            This is the process of creating
            a copy of an object in a different
            object inorder to enable it
            use the methods and fields present
            in it
         */
        System.out.println("enter a number");
        number = scannerObj.nextInt();

        /* the nextInt() method is found
            in the scanner that enable the
            program capture what the
            user has captured on the console
            and convert it to an integer
            which then stores in a variable
         */
        System.out.println("your number is" +
                ": "+number);

    }
}
