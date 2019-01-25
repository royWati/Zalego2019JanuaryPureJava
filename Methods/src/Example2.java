import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){
        System.out.println("KES \t DOLLAR \t FRANC \t POUND \t");
        System.out.println("select the type of currency you have");

        String owner_currency = new Scanner(System.in).nextLine();

        System.out.println("Which currency would you like to convert to");
        String converted_currency = new Scanner(System.in).nextLine();

       System.out.println("Enter the amount of money you wish to convert");
       double amount = new Scanner(System.in).nextDouble();

       double money = Conversion(owner_currency,converted_currency,amount);

       System.out.println("Amount is "+money+" "+converted_currency);

       main(args);


    }

    static double NormalCurrencyToBaseCurrency(String currency){
        double rate =0;
        switch (currency.toUpperCase()){
            case "KES" :
                rate =0.0103;
                break;
            case "POUND" :
                rate = 1.23;
                break;
            case "YEN" :
                rate = 0.01;
                break;
            case "FRANC" :
                rate = 1.3;
                break;
            default: rate=0;
                break;
        }
        return rate;
    }

    static double Conversion(String OwnerCurrency,String TargetCurrency,double amount){
        double money = 0;

        // check if the owner currency is a dollar
        if(OwnerCurrency.toUpperCase().equals("DOLLAR")){
            double rate = NormalCurrencyToBaseCurrency(TargetCurrency);
            money = amount / rate;
        }else{

            if (TargetCurrency.toUpperCase().equals("DOLLAR")){
                double rate = NormalCurrencyToBaseCurrency(OwnerCurrency);
                money = amount * rate;
            }else{

                double cur_to_dollar = NormalCurrencyToBaseCurrency(OwnerCurrency);
                double dollar_to_target_cur = NormalCurrencyToBaseCurrency(TargetCurrency);

                money = amount * cur_to_dollar / dollar_to_target_cur;
            }
        }

        return  money;
    }
}
