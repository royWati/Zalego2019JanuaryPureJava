import java.util.Scanner;

/* this example illustrates the use of arithmetic operators
     by java program
 */
public class Example1 {

    static int age;

    public static void main(String[] args){

        System.out.println("Enter your current age");
        Scanner scanner = new Scanner(System.in);

        // storing the inputed data to the variable age
        age = scanner.nextInt();

        // store the result/outcome of the operation in a variable

        int year = 2019-age;

        // outputing the result

        System.out.println("The year you were born is "+year);
    }

}
