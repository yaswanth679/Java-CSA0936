import java.util.Scanner;

class Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the string (press Enter twice to finish):");
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            stringBuilder.append(line).append("\n");
        }
        String str = stringBuilder.toString();

      
        String[] lines = str.split("\n");

        int lineCount = lines.length;

     
        System.out.println("Total number of lines: " + lineCount);

        scanner.close();
    }
}
