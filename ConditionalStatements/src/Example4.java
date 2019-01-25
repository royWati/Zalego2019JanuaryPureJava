import java.util.Scanner;

/* this example illustrates the use of a nested condition statement

 */
public class Example4 {

    public static void main(String[] args){
        System.out.println("Enter your marks");
        Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

        if(marks >=75 && marks <=100){
            if(marks <= 79){
                System.out.println("Your Grade is an A-");
            }else if(marks <=92){
                System.out.println("Your Grade is an A plain");
            }else{
                System.out.println("Your Grade is an A+");
            }
        }
    }
}
