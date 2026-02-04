public class Bitw
{
    public static void main(String[] args)
    {
        int a = 5;      // In binary: 0101
        int b = 3;      // In binary: 0011

        // Bitwise AND
        int andResult = a & b; // Result: 0001 (1 in decimal)
        System.out.println("Bitwise AND (a & b): " + andResult);

        // Bitwise OR
        int orResult = a | b;  // Result: 0111 (7 in decimal)
        System.out.println("Bitwise OR (a | b): " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // Result: 0110 (6 in decimal)
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);

        // Bitwise NOT
        int notResult = ~a;     // Result: ...11111010 (-6 in decimal, two's complement)
        System.out.println("Bitwise NOT (~a): " + notResult);

        // Left Shift
        int leftShiftResult = a << 1; // Result: 1010 (10 in decimal)
        System.out.println("Left Shift (a << 1): " + leftShiftResult);

        // Right Shift
        int rightShiftResult = a >> 1; // Result: 0010 (2 in decimal)
        System.out.println("Right Shift (a >> 1): " + rightShiftResult);
    }
}