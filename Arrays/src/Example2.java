import java.util.Scanner;

public class Example2 {

    public static void main(String [] args){
        int[] age = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter value:"+(i+1));
            int value = new Scanner(System.in).nextInt();
            age[i]=value;
        }
        //output
        int i=0;
        while(i<5){
            System.out.println("Value at "+i+"\t"+age[i]);
            i++;
        }
    }
}

