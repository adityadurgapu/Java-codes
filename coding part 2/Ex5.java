import java.util.Scanner;

class Ex5 {
    public static void main(String[] arg) {
        System.out.println("Enter a number: ");
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        // Generating the Collatz Sequence for a given number
        System.out.printf("Collatz Sequence for a number(%d) is %d ", n, n);
        while (n > 1) // collatz Sequence ends at 1
        {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
            System.out.printf("%d", n);
            if (n != 1)
                System.out.printf(" -->> ");
        }

    }

}