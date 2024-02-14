import java.util.Scanner;
class Bankaccount{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
    int balance=10000;

    System.out.println("enter account number");
    int accountnumber=s.nextInt();
    System.out.println("enter depositor name ");
    String depositorname=s.next();
    System.out.println("enter the account type(savings/current)");
    String accounttype=s.next();


    System.out.println("enter the amount to be deposited");
    int deposited=s.nextInt();
    balance=balance+deposited;
    System.out.println(deposited);

    System.out.println("enter the amount to withdraw");
    int withdraw=s.nextInt();
    if(balance-withdraw>=500){
     balance=balance-withdraw;
     System.out.println(withdraw);
    }
    else{
        System.out.println("insufficient amount");
    }
    System.out.println(balance);
    }
}
