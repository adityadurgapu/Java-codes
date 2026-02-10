import java.util.Scanner;

class Ex2 {
    public static void main(String[] arg) {
        System.out.println("Enter a number: ");
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        // bits of a number
        int t = n, r, sum = 0, p = 1;
        while (t > 0) {
            r = t % 2;
            sum = sum + r * p;
            p = p * 10;
            t = t / 2;
        }
        System.out.printf("binary number of given number (%d) is %d\n", n, sum);
        // to reverse the bits of a number
        int rev = 0, d, q = sum;
        while (q > 0) {
            d = q % 10;
            rev = rev * 10 + d;
            q = q / 10;
        }
        System.out.printf("reverse of the given bits (%d) is %d", sum, rev);
    }
}