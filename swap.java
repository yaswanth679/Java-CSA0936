import java.util.Arrays;
import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

       
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

      
        System.out.println("Original Array: " + Arrays.toString(array));

       
        if (array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }

        System.out.println("Array after swapping first and last elements: " + Arrays.toString(array));

        scanner.close();
    }
}
