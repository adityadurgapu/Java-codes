import java.util.Scanner;

class Ex6
{
    static void rev_arr(int[] num)
    {  
        for(int i =0 ,j = num.length -1,temp;i<j;i++,j--)
        {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] num = new int[size];
        System.out.println("Enter "+ size+" elements to be reversed:");
        for(int i = 0; i < num.length; i++)
        {
            num[i] = scanner.nextInt();
        }

        rev_arr(num);
        System.out.println("The reversed array will be: ");
        for(int i=0;i<num.length;i++)
        {
            System.out.print(num[i] + " ");
        }
        scanner.close();
    }
}