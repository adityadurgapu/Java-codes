import java.util.Scanner;
public class Ex3 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your bil amount:");
        double bill = obj.nextDouble();
        if(bill > 1000)
        {
        System.out.println("You are eligible for Discount");
        }
        else 
        {System.out.println("You are eligible not for Discount");
    }  
    }    
}
