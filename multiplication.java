import java.util.Scanner;
class Multiplication{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(n + " x " + i + " = " +n*i);
        }
    }
}