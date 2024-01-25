public class setCharAtinStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Imran Hossain");

        System.out.println(sb); 


        sb.setCharAt(1, 'k');
        sb.setCharAt(4, 'm');

        System.out.println(sb);
    }
}