import java.util.Scanner;
class Natural{
    public static void main(String a[]){
      int sum=0;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the value of n");
      int n=s.nextInt();
      for(int i=0;i<=n;i++){
        sum=sum+i;
      }
      System.out.print(sum);
    }
}