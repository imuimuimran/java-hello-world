import java.util.*;  
public class factorialofN {  
    public static void printFactorial(int n) {
        int factorial = 1;

        for(int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt(); 

        printFactorial(n);

        scanner.close();
    }  
}  