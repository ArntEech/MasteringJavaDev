import java.util.Scanner; // For user inputs

public class Challenge1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Java Programming");
        int age = 20;
        double height = 5.11;
        String name = "Arnold Kyei";
        boolean isSingle = true;

        // Sum of two numbers
        Scanner scanner = new Scanner(System.in); // Create Scanner object for keyboard input
        System.out.println("Enter two integer numbers seperated with a space (e.g, 12 23):");

        int a, b;
        a = scanner.nextInt(); // Read first number
        b = scanner.nextInt(); // Read second number
        int sum = a + b;

        System.out.println("You have entered the numbers " + a + " and " + b + "\nThe Sum of both numbers is: " + sum);

        // Check if a number is even
        if (sum % 2 == 0) {
            System.out.println("Their sum is Even");
        } else {
            System.out.println("Thier sum is Odd");
        }

        // The Square of the sum
        int squared = sum * sum;
        System.out.println("Its square is: " + squared);
    }
}
