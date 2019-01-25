import java.util.Scanner;

/* this example illustrates the use of an else if statement

 */
public class Example2 {
    static int marks;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your KCPE marks");

        marks = scanner.nextInt();

        if(marks >=400 && marks <= 500){
            System.out.println("You will join a national school");
        }else if(marks >=370 && marks <= 399){
            System.out.println("You will join an extra provisional");
        }else if(marks >=300 && marks <= 369){
            System.out.println("You will join a provisional");
        }else if(marks >=250 && marks <= 299){
            System.out.println("You will join a district school");
        }else{
            System.out.println("repeat of marks is overboard");
        }
    }

}
