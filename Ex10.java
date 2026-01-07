import java.util.Scanner;

public class Ex10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();

        int original = num;
        int reverse = 0;
        
        while (num > 0)
        {
            int digit = num % 10;
            reverse = reverse*10 + digit;
            num = num / 10;
        }
        if (original == reverse )
            System.out.println("The number is a palindrome number");
        else
            System.out.println("The number is not a palindrome number");
        scanner.close();
    }
}