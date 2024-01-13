import java.util.*;  
public class sumofTwoNumbers {  
    public static int calculetSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt(); 
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt(); 

        int sum = calculetSum(a, b);

        System.out.println(sum);
    }  
}  