import java.util.*;
// This program can creat username from email by deleting from @ to end of the mail address.
public class deleteSpecificPartinString {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter an Email Address: ");
        String email = sc.next();
        String userName = "";

        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }

        System.out.println("Your user name is: " + userName);

        sc.close();
    }
}