import java.util.Scanner;

class Ex7 
{
    public static void main(String[] args)
     {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        int count = 0;

        System.out.print("Element found at position(s): ");

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == key) 
            {
                System.out.print((i + 1) + " ");
                count++;
            }
        }

        if (count > 0)
        {
            System.out.println("\nNumber of occurrences = " + count);
        }
        else
        {
            System.out.println("\nElement not found in the array");
        }

        scanner.close();
    }
}