public class parseIntMethodinStringBuilder {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder("123456");

        // Convert StringBuilder to String
        String str = strBuilder.toString();

        // Convert String to Integer
        int number = Integer.parseInt(str);

        System.out.println(number);
    }
}
