public class appendinStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("H");

        System.out.println(sb); 


        //Append char
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');
        sb.append('!');

        System.out.println(sb);
    }
}