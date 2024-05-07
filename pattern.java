import java.util.Scanner;
class Pattern{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of m");
        int m=s.nextInt();
        System.out.println("enter the value of n");
        int n=s.nextInt();

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n-i;j++){
               System.out.println(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(" *");
            }
        }
            System.out.println();
    }
}