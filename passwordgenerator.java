import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Do you want to include uppercase letters? (yes/no): ");
        boolean includeUpperCase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want to include lowercase letters? (yes/no): ");
        boolean includeLowerCase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want to include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Do you want to include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        System.out.println("Generated Password: " + generatePassword(length, includeUpperCase, includeLowerCase, includeNumbers, includeSpecialChars));

        scanner.close();
    }

    public static String generatePassword(int length, boolean includeUpperCase, boolean includeLowerCase, boolean includeNumbers, boolean includeSpecialChars) {
        StringBuilder password = new StringBuilder();
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        String allowedChars = "";

        if (includeUpperCase) {
            allowedChars += uppercaseLetters;
        }
        if (includeLowerCase) {
            allowedChars += lowercaseLetters;
        }
        if (includeNumbers) {
            allowedChars += numbers;
        }
        if (includeSpecialChars) {
            allowedChars += specialChars;
        }

        if (allowedChars.isEmpty()) {
            System.out.println("Please choose at least one type of character.");
            return "";
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * allowedChars.length());
            password.append(allowedChars.charAt(randomIndex));
        }

        return password.toString();
    }
}
