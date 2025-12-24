import java.util.Scanner;
public class Ex2 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your number:");
        double number = obj.nextDouble();
        if (number < 0)
            {
                System.out.println("The Entered number is negative");
            }   
        else if (number == 0)

            {
                System.out.println("The Entered number is Zero");
            }
        else
            {
                System.out.println("The entered number is Positive");
            } 


    }    
}
