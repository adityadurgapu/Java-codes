import java.util.Scanner;
class Ex11
{
    static boolean isSymmetric(int[][] mat, int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++)
            {
                if (mat[i][j] != mat[j][i]) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter order of matrix (n x n): ");
        int n = scanner.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                mat[i][j] = scanner.nextInt();
            }
        }
        if (isSymmetric(mat, n)) 
            System.out.println("The matrix is Symmetric.");
        else 
            System.out.println("The matrix is NOT Symmetric.");
        scanner.close();
    }
}

