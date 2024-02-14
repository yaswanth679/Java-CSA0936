import java.util.Scanner;
class Clg7{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of m");
        int m=s.nextInt();
        System.out.println("enter the value of n");
        int n=s.nextInt();
        System.out.println("enter the value of o");
        int o=s.nextInt();
 
    if(m>n && m>o){
        System.out.println("m="+m);
    }
     else if(n>m && n>o){
        System.out.println("n="+n);
    }
    else{
        System.out.println("o="+o);
    }
}
}