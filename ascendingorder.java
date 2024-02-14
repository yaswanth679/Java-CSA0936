import java.util.Scanner;
import java.util.Arrays;

class Nine{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=s.nextInt();
        
        int[] array =new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }

        Arrays.sort(array);
     for(int i=0;i<size;i++){
     }
        System.out.println(Arrays.toString(array));
     }
    }
     