import java.util.Scanner;
class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

       
        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Enter a number (enter 0 to stop): ");
            int number = scanner.nextInt();

           
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

         
            if (number == 0) {
                continueInput = false;
            }
        }

       
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeroes: " + zeroCount);

        scanner.close();
    }
}
