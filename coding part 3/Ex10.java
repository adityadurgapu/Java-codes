import java.util.Scanner;

class Ex10
{
    static void rowSum(int[][] mat, int r, int c)
    {
        for (int i = 0; i < r; i++) 
        {
            int sum = 0;
            for (int j = 0; j < c; j++) 
            {
                sum += mat[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }
    }
    static void columnSum(int[][] mat, int r, int c)
    {
        for (int j = 0; j < c; j++) 
        {
            int sum = 0;
            for (int i = 0; i < r; i++) 
            {
                sum += mat[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c = scanner.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++) 
            {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nRow-wise sums:");
        rowSum(mat, r, c);
        System.out.println("\nColumn-wise sums:");
        columnSum(mat, r, c);
        scanner.close(); 
    }
}
