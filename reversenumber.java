import java.util.Scanner;
class Reversenumber{
    public static void main(String a[]){
       int reverse=0;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the value of n");
       int n=s.nextInt();

       while(n!=0){
        int rem=n%10;
        reverse=reverse*10+rem;
        n=n/10;
       }
       System.out.print(reverse);
    }
}