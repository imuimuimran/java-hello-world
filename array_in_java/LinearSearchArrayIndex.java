import java.util.Scanner;

public class LinearSearchArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // Input
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search: ");
        int searchNumber = sc.nextInt();

        // Output
        System.out.println("The inputed array's elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Search for the index of the given number
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == searchNumber) {
                index = i;
                break; // Break the loop if the number is found
            }
        }

        // Output the result
        if (index != -1) {
            System.out.println("\nThe number " + searchNumber + " is found at index: " + index);
        } else {
            System.out.println("\nThe number " + searchNumber + " is not found in the array.");
        }

        sc.close();
    }
}
