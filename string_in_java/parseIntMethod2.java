public class parseIntMethod2 {
    
    // String to Intiger
    public static void main(String args[]) {
        String str1 = "12";
        int number1 = Integer.parseInt(str1);

        String str2 = "8";
        int number2 = Integer.parseInt(str2);

        int sum = number1 + number2;

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

    }
}