public class deleteCharinStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Mohd. Imran Hossain");

        System.out.println(sb); 


        //delete char
        sb.delete(4, 5);

        System.out.println(sb);
    }
}