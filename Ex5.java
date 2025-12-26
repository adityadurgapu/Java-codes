import java.util.Scanner;
public class Ex5 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int First_num = obj.nextInt();
        System.out.println("Enter your second number:");
        int second_num = obj.nextInt();
        System.out.println("Enter your third number:");
        int third_num = obj.nextInt();

        if ((First_num >= second_num) && (First_num >= third_num))
        {
            System.out.println(First_num+" is the greastest number of all ");
        }
        else if ((second_num >= First_num) && (second_num >= third_num))
        {
            System.out.println(second_num+" is the greatest of all");
        }
        else
        {
            System.out.println(third_num+" is the greatest of all");
        }
    }
}