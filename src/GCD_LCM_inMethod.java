import java.util.Scanner;

public class GCD_LCM_inMethod{
    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int rem = a % b;
            a=b;
            b=rem;
        }
        return b;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));

        scanner.close();
    }
}
