import java.util.*;

public class inputNameArray {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many names do you want to input: ");
        int size = sc.nextInt();
        String names[] = new String[size];
       
        //input 
        System.out.println("Enter the names: ");
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }
       
        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }

        sc.close();
    }
}