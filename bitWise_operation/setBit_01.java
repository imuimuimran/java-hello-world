public class setBit_01{

    public static void main(String[] args) {
        int num = 5; 
        int position = 1;

        int bitMask = 1 << position;

        int newNumber = bitMask | num;

        System.out.println("The munber " + num + " is converted as " + newNumber + " after set bit manipulation");
    }

}
