import java.util.Scanner;
class Fibonacci{
   public static void main(String a[]){
    int n1=0,n2=1;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=s.nextInt();

    for(int i=1;i<=n;i++){
          System.out.print(n1+" ");

       int n3=n1+n2;
       n1=n2;
       n2=n3;
    }
   }
}