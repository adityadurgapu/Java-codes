import java.util.Scanner;

class Ex8
{
    static int pos_count(int[] num)
    {
        int pos_count = 0;
        for(int i = 0;i<num.length;i++)
        {
            if(num[i]>0)
            {
                pos_count++;
            }
        }
        return pos_count;
    }

    static int neg_count(int[] num)
    {
        int neg_count = 0;
        for(int i = 0;i<num.length;i++)
        {
            if(num[i]<0)
            {
                neg_count++;
            }
        }
        return neg_count;
    }

    static int even_count(int[] num)
    {
        int even_count = 0;
        for(int i = 0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
                even_count++;
            }
        }
        return even_count;
    }

    static int odd_count(int[] num)
    {
        int odd_count = 0;
        for(int i = 0;i<num.length;i++)
        {
            if(num[i]%2 != 0)
            {
                odd_count++;
            }
        }
        return odd_count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] num = new int[size];
        System.out.println("Enter "+size+" element(s):");
        for(int i =0;i<num.length;i++)
        {
            num[i] = scanner.nextInt();
        }

        int pos_count = pos_count(num);
        int neg_count = neg_count(num);
        int even_count = even_count(num);
        int odd_count = odd_count(num);


        System.out.println("The number of positive number(s):"+pos_count);
        System.out.println("The number of negative number(s):"+neg_count);
        System.out.println("The number of even number(s):"+even_count);
        System.out.println("The number of odd number(s):"+odd_count);

        scanner.close();
    }
}