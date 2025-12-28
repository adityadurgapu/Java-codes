public class Ex6 {
    public static void main(String[] args) {
        int count = 0;

        // loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {  
                 // check divisibility
                count++;
            }
        }

        System.out.println("Count of numbers divisible by 5: " + count);
    }
}