public class clearBit_01{

    public static void main(String[] args) {
        int num = 5; 
        int position = 2;

        int bitMask = 1 << position;

        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & num;

        System.out.println("The munber " + num + " is converted as " + newNumber + " after clear bit manipulation");
    }

}
