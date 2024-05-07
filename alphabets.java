import java.util.Scanner;
class Alphabets{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string");
        String n= s.nextLine();

        int letters=0;
        int spaces=0;
        int numbers=0;
        int others=0;

        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);

            if(Character.isLetter(ch)){
                letters++;
            }
            else if(Character.isSpaceChar(ch)){
                spaces++;
            }
            else if(Character.isDigit(ch)){
                numbers++;
            }
            else{
                others++;
            }
        }

        System.out.println(letters);
         System.out.println(spaces);
          System.out.println(numbers);
           System.out.println(others);
    }
}