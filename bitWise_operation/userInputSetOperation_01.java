import java.util.*;

public class userInputSetOperation_01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt(); 
        System.out.print("Enter the binary position which you want to know about bit: ");
        int position = sc.nextInt();

        int bitMask = 1 << position;

        if((bitMask & num) == 0) {
            System.out.println("number is zero");
        }else {
            System.out.println("number is one.");
        }
    
        sc.close();
    }

}
