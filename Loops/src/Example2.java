public class Example2 {

    // this example illustrates the fibonacci sequence


    public static void main(String[] args){
        int x =0;
        int y =1;

        for (int i=0;i<16;i++){
            int z = x+y;

            double ratio = (double)y / (double)z;

            System.out.println(z);
            System.out.println("\n"+ratio+"\n");
            x=y;
            y=z;
        }
    }
}
