import java.util.Scanner;
class MinMax{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=s.nextInt();

        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        int smallest=array[0];
        int largest=array[0];

        for(int i=1;i<size;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}