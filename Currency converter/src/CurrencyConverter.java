import java.util.Scanner;


public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nCURRENCY CONVERSION .....\n");

        //Currency selection
        System.out.print("Choose the base currency        : ");
        String baseCurrency = sc.nextLine();
        System.out.print("Choose the target currency      : ");
        String targetCurrency = sc.nextLine();

        //Currency rate
        System.out.print("Enter the currency rate " + (baseCurrency) + " to " + (targetCurrency) + "     : ");
        double currencyRate = sc.nextDouble();

        //Currency amount
        System.out.print("Enter the amount                : ");
        double amount = sc.nextDouble();

        //Currency conversion
        double newAmount = currencyRate * amount;

        //Display result
        System.out.println("\nYou can get " + targetCurrency + " : " + Math.round(newAmount*100)/100.0);

    }
}

/*
SOME CURRENCY RATES :
EUR 1 ,              USD 1.07,       Japan YEN 164.46,   Indian Rs 89.54
USD 1 ,              EUR 0.93,       Japan YEN 153.12,   Indian Rs 83.37
Japan yen 1 ,        EUR 0.0061,     USD 0.0065,         Indian Rs 0.54
Indian Rs 1 ,        EUR 0.011,      USD 0.012,          Japan YEN 1.84
*/