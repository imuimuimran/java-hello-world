public class comparetoStringBuilder {
    public static void main(String[] args) {
        StringBuilder name1Builder = new StringBuilder("Imran");
        StringBuilder name2Builder = new StringBuilder("Imran");

        // Convert StringBuilder to String for comparison
        String name1 = name1Builder.toString();
        String name2 = name2Builder.toString();

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
