import java.util.Scanner;

class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonus = 0.0;

        if (yearsOfService > 5) {
            bonus = 0.05 * salary;
        }

        System.out.println("Net bonus amount: " + bonus);

        scanner.close();
    }
}
