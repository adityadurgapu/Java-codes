import java.util.Scanner;

public class Ex3
{  
    static int even_count(int[] num)
    {   
        int even_count = 0;
        for(int i=0;i<num.length;i++ )
        {
            if( num[i]%2 == 0)
            {
                even_count++;
            }
        }
        return even_count;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] num = new int[size];
        System.out.println("Enter "+ size+" element(s):");
        for(int i = 0; i < num.length ; i++ )
        {
            num[i] = scanner.nextInt();
        }
        int even = even_count(num);
        System.out.println("The even numbers are: "+ even);
    
        scanner.close();
    }    
}
