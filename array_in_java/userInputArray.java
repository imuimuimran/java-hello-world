import java.util.*;

public class userInputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        // Input
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("The inputed array's are: ");
        // Output
         for(int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
