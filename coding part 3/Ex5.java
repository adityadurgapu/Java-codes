import java.util.Scanner;

class Ex5
{
    static int max(int[] num)
    {
        int max = num[0];
        for(int i = 0; i < num.length; i++)
        {
            if(max < num[i])
            {
               max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size = scanner.nextInt();

        int[] num = new int[size];
        System.out.println("Enter "+size+" element(s):");
        for(int i = 0 ;i<num.length;i++)
        {
            num[i] = scanner.nextInt();
        }

        int max_number = max(num);
        System.out.println("The maximum number in the array is:"+max_number);

        scanner.close();
    }
}