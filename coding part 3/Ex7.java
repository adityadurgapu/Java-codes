import java.util.Scanner;

class Ex7
{
    static int[] copy(int[] num)
    {
        int[] copy_array = new int[num.length] ;
        for(int i = 0;i<num.length;i++)
        {
            copy_array[i] = num[i];
        }
        return copy_array;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] number = new int[size];
        System.out.println("Enter " + size + " element(s):");
        for (int i = 0;i<number.length;i++)
        {
            number[i] = scanner.nextInt();
        }

        int[] Result = copy(number);
        System.out.println("Copied array elements: ");
        for(int i =0;i<Result.length;i++)
        {
            System.out.print(Result[i]+" ");
        }
        
        scanner.close();

    }
}