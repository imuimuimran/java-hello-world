import java.util.*;
public class twoDArraySpiralOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 0 based number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the 0 based number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        // Input
        // Rows
        System.out.println("Input all numbers of rows and columns: ");
        for(int i = 0; i < rows; i++) {
            // Column
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;

        
        //To print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
        //1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;
    
            //3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            System.out.println();
        }

        sc.close();
    }
}