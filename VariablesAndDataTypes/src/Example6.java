
/* this example aims to show the outcome of
    a logical expression that tends to check
    if two strings are identical
 */

import java.util.Scanner;

public class Example6 {
    static String word1,word2;

    public static void main(String[] args){
        // use a Scanner Object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");

        //storing the first input to word 1
        word1 = scanner.nextLine();

        System.out.println("enter the second word");
        // storing the second input to word 2
        word2 = scanner.nextLine();

        /* we will create a local boolean variable
            that we will use to store the outcome of the
            result and output the result
         */
        boolean result = word1.equals(word2);
        //outputting the result
        System.out.println("the result is "+result);
    }
}
