import java.util.Scanner;

/* this example illustrates the use of a switch
    statement.
 */
public class Example3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int marks = scanner.nextInt();

        switch (marks){
            case 350 :
                System.out.println("Litei High School");
                break;
            case 360 :
                System.out.println("Mt Lavana");
                break;
            case 340 :
                System.out.println("Valence");
                break;
            default: System.out.println("we could not find your school");
            break;
        }
    }
}
