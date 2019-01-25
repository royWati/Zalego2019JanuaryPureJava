public class Example4 {
    public static void main(String [] args){
        int[][] salary = {{20,30,40,50,59},{20,10,34,43,45}};

        //output
        for(int r=0;r<2;r++){
            for(int c=0;c<5;c++){
                System.out.println("Value at array/row "+
                        (r+1) + " column " + (c+1) +" is "+salary[r][c]);
            }
        }
    }
}



