/*A number is called a special number if the sum of its digits is even.
 Write a Java program to check whether a number is special or not.*/

 import java.util.Scanner;

public class Ex8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = scanner.nextInt();

        int sum = 0;
        int temp = num;

        while (temp > 0)
        {
            sum += temp % 10;  // Get last digit
            temp /= 10;        // Remove last digit
        }

        if (sum % 2 == 0)
        {
            System.out.println("The entered number is a special number");
        }
        else 
        {
            System.out.println("The entered number is not special number");
        }
        scanner.close();
    }
}