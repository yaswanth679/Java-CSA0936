import java.util.Scanner;
class Ten1{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();

        String octal=decimalToOctal(n);
        System.out.println(octal);
    }
        private static String decimalToOctal(int n){
            return Integer.toOctalString(n);
        }
    }
