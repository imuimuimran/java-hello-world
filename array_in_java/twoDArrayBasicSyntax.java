import java.util.*;
public class twoDArrayBasicSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 0 based number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the 0 based number of columns: ");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // Input
        // Rows
        System.out.println("Input all numbers of rows and columns: ");
        for(int i = 0; i < rows; i++) {
            // Column
            for(int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        // Rows
        System.out.println("This is output of all numbers of rows and columns: ");
        for(int i = 0; i < rows; i++) {
            // Column
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}