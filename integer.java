import java.util.Scanner;

 class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

     
        int nn = n * 10 + n; 
        int nnn = n * 100 + nn;  
        int result = n + nn + nnn;

     
        System.out.println("Result of the expression " + n + " + " + nn + " + " + nnn + " = " + result);

        scanner.close();
    }
}
