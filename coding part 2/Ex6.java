import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 1;  // first term

        for (int i = 5; i <= n; i = i + 5) {
            sum = sum + i;
        }

        System.out.println("Sum of the series is: " + sum);

        scanner.close();
    }
}