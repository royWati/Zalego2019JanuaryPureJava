import java.util.Scanner;

public class Example5 {
    public static void main(String [] args){
        int[][] age = new int[2][5];
        //input
        for(int r=0;r<2;r++){
            for(int c=0;c<5;c++){
                System.out.println("Enter value for array/row "+(r+1)
                        + " column " + (c+1));
                int value = new Scanner(System.in).nextInt();
                age[r][c] = value;
            }
        }
        //output
        for(int r=0;r<2;r++){
            for(int c=0;c<5;c++){
                System.out.println("Value at array/row "+
                        (r+1) + " column " + (c+1) +" is "+age[r][c]);
            }
        }
    }
}
