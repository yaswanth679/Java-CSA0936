import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Nine3{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=s.nextInt();
        
        int[] array =new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }

        Set<Integer> uniqueSet=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

        for(int value:array){
            if(!uniqueSet.add(value)){
                duplicates.add(value);
            }
        }
        if(duplicates.isEmpty()){
            System.out.print("no duplicates found");
        }
        else{
            System.out.print("found"+duplicates);
        }
    }
}