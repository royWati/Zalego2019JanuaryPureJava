import java.util.Scanner;

/* this example aims to show how to manupilate a string using
    the methods found inside the String object
    we use the String.length() method for this example
 */
public class Example5 {

    static String texts;

    // store the total number of characters present in texts
    static int total_characters;
    public static void main(String[] args){
        // scanner object to help us input values
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text below");
        // capturing the input and storing it texts variable
        texts = scanner.nextLine();

        // count the number of characters using .length() method
        total_characters = texts.length();

        //output the total number of characters
        System.out.println("total number of characters are "+total_characters);

    }
}
