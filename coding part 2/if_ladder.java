import java.util.Scanner;

public class if_ladder
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your data usage: ");
        double data = obj.nextDouble();
        obj.nextLine();
        
        System.out.print("Are you a student(yes/no): ");
        String verify = obj.nextLine();

        int bill = 0;

        if (data <= 1)
            bill = 199;
        else if (data > 1 && data <=3)
            bill = 349;

        

        if (verify.equals("yes"))
        {
            System.out.print("your amount is:" + bill*0.9);
        }
        else if (verify.equals("no") )
        {
            System.out.print("your amount is:" + bill);
        }
        obj.close();
    }
    
}