public class stringBuilderLength {
    public static void main(String[] args) {
        StringBuilder fullNameBuilder = new StringBuilder();

        String firstName = "Mohd. Imran";
        String lastName = "Hossain";

        // StringBuilder concatenation
        fullNameBuilder.append(firstName).append(" ").append(lastName);
        String fullName = fullNameBuilder.toString();

        System.out.println(fullName.length());

        // Iterate over each character using StringBuilder
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
    }
}

