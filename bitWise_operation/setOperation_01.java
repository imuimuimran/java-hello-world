public class setOperation_01{
    public static void main(String[] args) {
        int num = 5; // the binary of decimal 5 is 0101
        int position = 2; // so the 2nd (0101) or left side position 2 is 1

        int bitMask = 1 << position;

        if((bitMask & num) == 0) {
            System.out.println("number is zero");
        }else {
            System.out.println("number is one.");
        }
    
    }

}
