//Jermaine cool code

import java.util.*;
import java.text.DecimalFormat;

public class RetailPrice
{
    public static void main(String[] args)
    {
        calculateRetail();
    }

    public static void calculateRetail()
    {
        DecimalFormat decimal = new DecimalFormat("$#,###.00");
        Scanner keyboard = new Scanner(System.in);
        double price,total;
        int percentage;

        System.out.println("Please enter the price: ");
        price = keyboard.nextDouble();

        while(price < 0)
        {
            System.out.println("Price cannot be negative. Enter a positive price");
            price = keyboard.nextDouble();
        }

        System.out.println("Please enter the markup percentage: ");
        percentage = keyboard.nextInt();

        while(percentage < 0)
        {
            System.out.println("Percentage cannot be negative. Please enter a positive percentage.");
            percentage = keyboard.nextInt();
        }

        total = price + price / 100 * percentage;

        System.out.println("The total retail price is " + decimal.format(total));
    }

}
