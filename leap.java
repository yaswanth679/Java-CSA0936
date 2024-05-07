import java.util.Scanner;
class Leap{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of m");
        int m=s.nextInt();
         
         if((m%4==0)||(m%100!=0)&&(m%400==0)){
            System.out.println("year is leap year");
         }
         else{
            System.out.println(" year is not a leap year");
         }
    }
}
