import java.util.*;
public class cumulativeLengthofArrayofString {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter the size of array of string: ");
        int size = sc.nextInt();
        
        String array[] = new String[size];
        int totalLength = 0;

        // Input
        System.out.print("Input the arrays of string: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totalLength += array[i].length();
        }

        System.out.println("The length of cumulative string is: " + totalLength);

        sc.close();
    }
}