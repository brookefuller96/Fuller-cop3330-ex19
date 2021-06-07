
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        Scanner input = new Scanner(in);
        String str1 = input.nextLine();


        if (str1.equals("C") || str1.equals("c") )
        {
            System.out.println("Your choice: C");
            System.out.println("Please enter the temperature in Fahrenheit:");
            Scanner input2 = new Scanner(in);
            String Far = input2.nextLine();
            int F = Integer.parseInt(Far);
            double C = (F - 32 ) * 5 / 9;
            System.out.println("The temperature in Celsius is " + C + ".");
        }
        if (str1.equals("F") || str1.equals("f") )
        {
            System.out.println("Your choice: F");
            System.out.println("Please enter the temperature in Celsius:");
            Scanner input3 = new Scanner(in);
            String Cel = input3.nextLine();
            int C  = Integer.parseInt(Cel);
            double F = (C * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + F + ".");

        }
        else
        {
            System.out.println("Please choose a valid entry.");
        }
    }
}