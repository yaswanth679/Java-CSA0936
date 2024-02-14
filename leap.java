import java.util.Scanner;
class Clg9{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();

        if((n%4==0 && n/100!=0 && n%400==0)){
            System.out.print("n is leapyear");
        }
        else{
            System.out.print("n is not a leap year");
        }
    }
}