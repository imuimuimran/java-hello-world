import java.util.*; 
public class parseIntMethod3 {
    
    // String to Intiger
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string number: ");  
        String str1= sc.next();

        int number1 = Integer.parseInt(str1);

        System.out.print("Enter Second string number: ");  
        String str2= sc.next();

        int number2 = Integer.parseInt(str2);

        int sum = number1 + number2;

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

        sc.close();

    }
}