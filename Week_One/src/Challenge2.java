import java.util.Scanner;

public class Challenge2 {
    
    public static void main(String[] args) {
        // Declaration and Initialization of different primitives data types
        int age = 23;
        double litters = 34.3;
        char letter = 'A';
        boolean isNice = true;

        // Basic arithmetic operations (int and double)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers (separate with a space. e.g 23.5 56): ");
        

        double a, b, add, subs, mod, div;

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        // Results for basic Arithmetic
        add = a + b;
        subs = a - b;
        mod = a % b;
        div = a / b;

        System.out.print("Basic Arithmetic:\nAddition: "  + add + "\n" + "Substruction: " + subs + "\n" + "Module: " + mod + "\n" + "Division: " + div);

        // String conversion to int using "Integer.parselnt"
        System.out.print("\n\nEnter numeric string: ");
        String origin = scanner.nextLine();
        int converted = Integer.parseInt(origin);

        System.out.print("\n\n Results: \n" + "Input: "+ origin + "\nConverted string: " + converted);
    }
}