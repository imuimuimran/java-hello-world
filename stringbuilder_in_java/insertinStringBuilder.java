public class insertinStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder(" Imran Hossain");

        System.out.println(sb); 


        sb.insert(0, 'M');
        sb.insert(1, 'o');
        sb.insert(2, 'h');
        sb.insert(3, 'd');
        sb.insert(4, '.');

        System.out.println(sb);
    }
}