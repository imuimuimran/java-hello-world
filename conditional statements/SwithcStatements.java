import java.util.*;  
class SwitchStatements {  
    public static void main(String[] args)  {  
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter an option: ");
        int options = sc.nextInt();
        switch(options) {
            case 1: System.out.println("Good Morning!");
            break;
            case 2: System.out.println("Good Afternoon!");
            break;
            case 3: System.out.println("Good Night!");
            break;
            default: System.out.println("Invalid option!");
        }
        
    }  
}  
