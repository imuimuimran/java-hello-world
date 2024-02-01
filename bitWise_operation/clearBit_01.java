public class clearBit_01{

    public static void main(String[] args) {
        int num = 5; 
        // The binary of decimal 5 is 0101
        int position = 2;
        // Now we want the 2nd position will be clear
        // It means 0101 position 0 = 1, position 1 = 0, position 2 = 1, position 2 = 0
        // We will clear position 2 = 1 which will be as 0; 
        // So, it will turn into 0001 from 0101. which is decimal 1.

        int bitMask = 1 << position; // 0101 will be 0001 or 0100.

        int notBitMask = ~(bitMask); // By this method binary 1 will be 0, binary 0 will be 1. so, 0100 will be: 1011.

        int newNumber = notBitMask & num; // Now (1011 & 0101) will be: 0001, which is the decimal value of 1.

        System.out.println("The munber " + num + " is converted as " + newNumber + " after clear bit manipulation");
    }

}
