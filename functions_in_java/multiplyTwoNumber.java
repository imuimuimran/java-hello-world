import java.util.*;  
public class multiplyTwoNumber {  
    public static int productCalculet(int a, int b) {
        return a * b;
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt(); 
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt(); 

        System.out.println("The product of two number is: " + productCalculet(a, b));

        scanner.close();
    }  
}  