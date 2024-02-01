import java.util.*;
public class updateBit_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operation number (Either 0 or 1): "); // set method for 1, clear method for 0
        int oper = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        System.out.print("Enter binary position: ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;
        if(oper == 1) {
            // set method
            int newNumber = bitMask | num;
            System.out.println("The munber " + num + " is converted as " + newNumber + " after set bit manipulation"); 
        }else {
            // Clear operation
            int newBitMusk = ~(bitMask);
            int newNumber = newBitMusk & num;
            System.out.println("The munber " + num + " is converted as " + newNumber + " after set bit manipulation");
        }

        sc.close();
    }
}