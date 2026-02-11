import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase word: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); 
            }

            result = result + ch; 
        }

        System.out.println("Lowercase word: " + result);
        scanner.close();
    }
}