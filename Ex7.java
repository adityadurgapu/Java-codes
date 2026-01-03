// Given a number, find the sum of all even numbers from 1 to that number.
import java.util.Scanner;
public class Ex7
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number:");
        int guess = obj.nextInt();
        
        int  sum = 0;
        for (int i = 2 ;i <= guess ; i+= 2)
        {
            sum += i;
        }
        System.out.println("The sum will be "+sum);
        obj.close();
    }
}