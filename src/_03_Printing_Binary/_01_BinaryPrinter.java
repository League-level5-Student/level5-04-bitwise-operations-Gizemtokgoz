package _03_Printing_Binary;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	String bytestr = Integer.toBinaryString(b);
    	System.out.println(bytestr.charAt(0));
    	
        // Shift b seven bits to the right
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	int bee;
    	bee = (b >> 7) & 1;
        // Print the result using System.out.print (NOT System.out.println)
    	System.out.print(bee);
        //Use this method to print the remaining 7 bits of b
    	bee = (b >> 6) & 1;
    	System.out.print(bee);
    	bee = (b >> 5) & 1;
    	System.out.print(bee);
    	bee = (b >> 4) & 1;
    	System.out.print(bee);
    	bee = (b >> 3) & 1;
    	System.out.print(bee);
    	bee = (b >> 2) & 1;
    	System.out.print(bee);
    	bee = (b >> 1) & 1;
    	System.out.print(bee);
    	bee = (b >> 0) & 1;
    	System.out.print(bee);
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	byte first;
    	byte second;
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	first = (byte) (s & 255);
    	second = (byte) ((s >> 8) & 255);
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    	printByteBinary(first);
    	printByteBinary(second);
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	short first;
    	short second;
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short
    	first = (byte) (i  & 65535);
    	second = (byte) ((i >> 16) & 65535);
        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    	printShortBinary(first);
    	printShortBinary(second);
    }

    public void printLongBinary(long l) {
        // Use the same method as before to complete this method
    }

    public static void main(String[] args) {
        // Test your methods here
    	byte btest = (byte) 12345678;
    	printByteBinary(btest);
    	printIntBinary(178);
    	short stest = (short) 987654321;
    	printShortBinary(stest);
    }
}
