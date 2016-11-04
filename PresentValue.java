//GIo

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;

public class PresentValue
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double futureValue,annualInterest;
        int years;
        System.out.println("Please enter fututevalue");
        futureValue = keyboard.nextDouble();
        System.out.println("please enter annual");
        annualInterest = keyboard.nextDouble();
        System.out.println("years");
        years = keyboard.nextInt();
        presentValue(futureValue,annualInterest,years);

    }
    public static void presentValue(double y, double z, int x)
    {
        double presentvalue;
        presentvalue = y/(Math.pow((1+z/100),x));
        System.out.print(presentvalue);
    }
}
