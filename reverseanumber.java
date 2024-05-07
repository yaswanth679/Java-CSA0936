import java.util.Scanner;
class Reverse{
    public static void main(String a[]){
        int reverse=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();

        for(int i=0;i<=n;i++){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
            System.out.println(reverse);
        }
    }
