import java.util.*;  
class userInputString  {  
    public static void main(String[] args)  {  
        Scanner sc= new Scanner(System.in);
        
        // System.out.print("Enter Your Name with single word: ");  
        // String name_single= sc.next();  

        // System.out.println("Your Name is: " + name_single);
        
        
        System.out.print("Enter Your Name with multiple word: ");  
        String name_multiple= sc.nextLine();       
         
        System.out.println("Your Full Name is: " + name_multiple);    
        
        sc.close();
    }  
}  