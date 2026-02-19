import java.util.Scanner;

class Ex9 
{
    static int[][] addMatrices(int[][] A, int[][] B, int r, int c) 
    {
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c = scanner.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
            {
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                B[i][j] = scanner.nextInt();
            }
        }
        int[][] result = addMatrices(A, B, r, c);
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }scanner.close();
    }
}