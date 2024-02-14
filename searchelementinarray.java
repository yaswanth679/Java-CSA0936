import java.util.Scanner;

class Nine1{
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=s.nextInt();
        
        int[] array =new int[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }

        System.out.println("enter the search element");
        int target=s.nextInt();
         
         boolean found=false;
        for(int i=0;i<size;i++){
            if(array[i]==target){
                found=true;
            }
        }
        if(found){
            System.out.print("found");
        }
        else{
            System.out.print("not found");
        }
    }
}
