import java.util.Scanner;
class Largestnumber{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=s.nextInt();

        int[] array=new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        int max=array[0];
        for(int i=0;i<size;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
    System.out.print(max);
}
}