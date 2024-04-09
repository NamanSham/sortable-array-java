import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Please write the number of elements you want: ");
        int n = scanner.nextInt();

        // Input the elements
        int[] array = new int[n];
        System.out.println("Now type the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sorting the array using bubble sort
        Sort.bubbleSort(array);

        // Displaying the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Performing Linear Search
        System.out.print("You can now do search. Please enter the number: ");
        int searchKey = scanner.nextInt();
        int index = Search.linearSearch(array, searchKey);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
