
/* this example demonstates the use of an if statement
 */

import java.util.Scanner;

public class Example1 {

    static int marks;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your KCPE marks");

        marks = scanner.nextInt();

        // check if the mark is > 400
        if(marks >=400 && marks <=500){
            System.out.println("You will join a national school");
        }else{
            System.out.println("You will join a provisional school or your marks in overboard");
        }
    }
}
