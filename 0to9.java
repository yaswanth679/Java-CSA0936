import java.util.Scanner;
class Sum{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string");
        String input=s.nextLine();

        char[] digits=input.toCharArray();

        long sum=0;
        for(char digit:digits){
            if(digit>='0' && digit<='9'){
                sum+=(digit-'0');
            }
        }
        System.out.println(sum);
    }
}