public class BitwiseOperations {
    public static void main(String[] args) {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));

/*        0101  (5 in binary)
       ^  0011  (3 in binary)
        ------------
          0110  (6 in binary) */
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Left Shift a: " + (a << 1));
        System.out.println("Right Shift a: " + (a >> 1));
    }
}
