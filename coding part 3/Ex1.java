import java.util.Scanner;
class Ex1
{
    static void display(int[] num)
    {
        System.out.println("Your array elements are: ");
        for(int i = 0; i <num.length;i++)
        System.out.print(num[i] + " ");
    }


    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your array elements");
        int[] num = new int[10];
        for(int i=0;i<num.length ; i++)
            {num[i] = scanner.nextInt();}
        display(num);

        scanner.close();
    }
}