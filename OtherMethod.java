//Gio Amirajibi

import java.util.*;
import java.text.DecimalFormat;

public class OtherMethod
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double cost;
        int percentage;
        System.out.println("Please enter cost: ");
        cost = keyboard.nextDouble();
        System.out.println("Please enter percentage: ");
        percentage = keyboard.nextInt();
        calculateRetail(cost,percentage);
    }
    public static void calculateRetail(double y, int z)
    {
        DecimalFormat decimal = new DecimalFormat("$#,###.00");
        double total;
        total = y + y/100 * z;
        System.out.println(decimal.format(total));

    }
}
