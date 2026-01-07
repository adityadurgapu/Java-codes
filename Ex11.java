import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your operation number: ");
            op = scanner.nextInt();

            if (op >= 1 && op <= 4) {
                System.out.print("Enter your first number: ");
                double int_1 = scanner.nextDouble();
                System.out.print("Enter your second number: ");
                double int_2 = scanner.nextDouble();

                switch (op) {
                    case 1:
                        System.out.println("Result: " + (int_1 + int_2));
                        break;
                    case 2:
                        System.out.println("Result: " + (int_1 - int_2));
                        break;
                    case 3:
                        System.out.println("Result: " + (int_1 * int_2));
                        break;
                    case 4:
                        if (int_2 != 0)
                            System.out.println("Result: " + (int_1 / int_2));
                        else
                            System.out.println("Error: Division by zero is not allowed.");
                        break;
                }
            } else if (op != 5) {
                System.out.println("Invalid choice. Please select from 1 to 5.");
            }

        } while (op != 5);

        System.out.println("Thank you! Program exited.");
        scanner.close();
    }
}