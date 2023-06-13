import java.util.Arrays;
import java.util.Scanner;

public class Arrays_LeftRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Taking size of array as input from the user using Scanner class
        System.out.println("Enter the length of the array:");
        int n = input.nextInt();
        // Initialisation of Array of size 'n'
        int[] arr = new int[n];
        // Calling the function to take input of array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // Taking the number of rotations as input from the user
        System.out.println("Enter the number of rotations:");
        int d = input.nextInt();
        // Calling the function to rotate the array
        int[] result = array_left(arr, d);
        // Printing the rotated array
        System.out.println("The rotated array is:" + Arrays.toString(result));

    }

    // Function to rotate the array by 'n' times
    static int[] array_left(int[] arr, int d) {
        // initialise i=0
        int i = 0;
        // Loop for rotation
        while (i < d) {
            int temp = arr[0]; // creating and assigning temp is equal to element at index zero in Array
            // for loop for moving elements to their left position
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            // assign last element which comes after the rotation
            arr[arr.length - 1] = temp;
            // increment i
            i++;
        }
        // returning the array
        return arr;
    }

}
