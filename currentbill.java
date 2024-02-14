import java.util.Scanner;
class Currentbill{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter consumer number");
        int consumernumber=s.nextInt();
        System.out.println("enter consumer name");
        String consumername=s.next();
        System.out.println("enter previous month reading");
        int previousreading=s.nextInt();
        System.out.println("enter current month reading");
        int currentreading=s.nextInt();

        int unitsconsumed=currentreading-previousreading;
        double billamount=0;

        if(unitsconsumed<=100){
            billamount=unitsconsumed*1;
        }
        else if(unitsconsumed<=200){
            billamount=100+(unitsconsumed-100)*2.5;
        }
        else if(unitsconsumed<=500){
            billamount=200+(unitsconsumed-200)*4;
        }
        else{
            billamount=500+(unitsconsumed-500)*6;
        }
        System.out.println("electricity bill details");
        System.out.println(consumername);
        System.out.println(consumernumber);
        System.out.println(unitsconsumed);
        System.out.println(billamount);
    }
}