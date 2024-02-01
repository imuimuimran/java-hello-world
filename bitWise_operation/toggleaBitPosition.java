import java.util.Scanner;

public class toggleaBitPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Enter the position of the bit to toggle: ");
        int pos = scanner.nextInt();

        int result = toggleBit(n, pos);

        System.out.println("Number after toggling bit at position " + pos + ": " + result);

        scanner.close();
    }

    static int toggleBit(int num, int pos) {
        // Create a mask with the bit at the specified position set to 1
        int mask = 1 << pos;

        // Toggle the bit using XOR (^) with the mask
        return num ^ mask;
    }
}
