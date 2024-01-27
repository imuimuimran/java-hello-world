import java.util.Scanner;

public class replaceLetterinStringBuilder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.next();

        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                resultBuilder.append('i');
            } else {
                resultBuilder.append(str.charAt(i));
            }
        }

        String result = resultBuilder.toString();

        System.out.println("The converted word is: " + result);

        sc.close();
    }
}
