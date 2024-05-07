import java.util.Scanner;
class Attendance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        double attendancePercentage = (double) classesAttended / classesHeld * 100;

        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("You are not allowed to sit in the exam due to low attendance.");
        }

        scanner.close();
    }
}
