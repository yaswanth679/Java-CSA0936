import java.util.Scanner;
class Factors{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}