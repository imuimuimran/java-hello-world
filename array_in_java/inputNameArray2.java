import java.util.*;

public class inputNameArray2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many names do you want to input: ");
        int size = sc.nextInt();
        sc.nextLine();
        
        String names[] = new String[size];
       
        // Input 
        System.out.println("Enter the names: ");
        for(int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
       
        // Output
        for(int i = 0; i < names.length; i++) {
            System.out.println("Name " + (i + 1) + " is: " + names[i]);
        }

        sc.close();
    }
}
