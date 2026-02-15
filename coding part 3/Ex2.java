import java.util.Scanner;

public class Ex2 {
    static int sum(int[] num){
         int sum = 0;
        for(int i = 0; i < num.length; i++) 
        {
            sum += num[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] num = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for(int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }    

        int sum = sum(num);
        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}