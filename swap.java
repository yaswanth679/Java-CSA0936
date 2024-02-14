import java.util.Scanner;
class Swap{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of b");
        int b=s.nextInt();
           System.out.println("enter the value of c");
        int c=s.nextInt();
          
          b=b+c;
          c=b-c;
          b=b-c;

          System.out.println("after swapping"+"b="+ b +"c ="+c);
    }
}



