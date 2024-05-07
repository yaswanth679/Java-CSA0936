import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients (a, b, c) of the quadratic equation ax^2 + bx + c = 0:");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real solutions exist.");
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("One real solution exists: x = " + root);
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real solutions exist: x1 = " + root1 + ", x2 = " + root2);
        }

        scanner.close();
    }
}
