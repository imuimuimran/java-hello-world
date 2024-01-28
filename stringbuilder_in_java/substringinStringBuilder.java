public class substringinStringBuilder {
    public static void main(String[] args) {
        String sentence = "Mohd. Imran Hossain";

        // Using StringBuilder for substring
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 6; i < 11; i++) {
            nameBuilder.append(sentence.charAt(i));
        }

        String name = nameBuilder.toString();

        System.out.print(name);
    }
}

