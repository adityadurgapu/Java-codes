import java.util.Scanner;

public class Ex4
{
    static boolean search(int[] num, int key)
    {
        for (int i = 0; i<num.length;i++)
        {
            if(key == num[i])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] num = {1,23,45,66,78,89};
        System.out.println("Enter the key to search in the array:");
        int key = scanner.nextInt();
        
        boolean result = search(num,key);
        System.out.println(result);
        scanner.close();        
    }
}