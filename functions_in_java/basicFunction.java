import java.util.*;  
public class basicFunction {  
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args)  {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter Your Name: ");
        String name = scanner.next();  

        printMyName(name);
    }  
}  