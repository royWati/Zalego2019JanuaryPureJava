public class Example3 {

    //this example illustrates the use of a nested for loop

    public static void main(String[] args){

        for(int i = 1 ;i < 5 ; i++ ){

            System.out.println("Athelete No: "+i);
            for(int lap =1 ;lap < 5;lap++){
                System.out.println("\t Lap No: "+lap);
            }

            System.out.println("passing the barton...");
        }
    }
}
