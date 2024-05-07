import java.util.Arrays;
import java.util.Scanner;

class Sum {
    public static void main(String a[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int left = 0;
        int right = size - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (Math.abs(currentSum) < Math.abs(closestSum)) {
                closestSum = currentSum;
                closestPair[0] = arr[left];
                closestPair[1] = arr[right];
            }
            if (currentSum > 0) {
                right--;
            }
           
            else {
                left++;
            }
        }

        
        System.out.println("Two elements with sum near zero: " + Arrays.toString(closestPair));

        s.close();
    }
}
