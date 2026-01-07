//Write a Java program to reverse a number and explain each step of the logic.


import java.util.Scanner;

public class Ex9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word:");
        String word = scanner.nextLine();
        String reversed = "";

        for (int i = word.length()-1 ; i>= 0 ; i-- )
        {
            reversed = reversed + word.charAt(i);
        }

        System.out.println(reversed);

        scanner.close();
    }
}