import java.util.Scanner;
class GCD{
    public static void main(String a[]){
        int gcd=1;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of m");
        int m=s.nextInt();
        System.out.println("enter the value of n");
        int n=s.nextInt();

        for(int i=1;i<=m||i<=n;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }
            int lcm=(m*n)/gcd;
        System.out.println("gcd of"+m+ "and"+n+"is"+gcd);
         System.out.println("lcm of"+m+ "and"+n+"is"+lcm);
    System.out.println();
}
}

    
    

