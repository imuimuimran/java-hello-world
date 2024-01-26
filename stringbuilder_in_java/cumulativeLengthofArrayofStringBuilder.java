import java.util.Scanner;

public class cumulativeLengthofArrayofStringBuilder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array of string: ");
        int size = sc.nextInt();

        String[] array = new String[size];
        StringBuilder cumulativeString = new StringBuilder();

        // Input
        System.out.print("Input the arrays of string: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            cumulativeString.append(array[i]);
        }

        int totalLength = cumulativeString.length();

        System.out.println("The length of cumulative string is: " + totalLength);

        sc.close();
    }
}
