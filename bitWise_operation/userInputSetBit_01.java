import java.util.*;
public class userInputSetBit_01{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt(); 
        System.out.print("Enter a binary position: ");
        int position = sc.nextInt();

        int bitMask = 1 << position;

        int newNumber = bitMask | num;

        System.out.println("The munber " + num + " is converted as " + newNumber + " after set bit manipulation");

        sc.close();
    }

}
