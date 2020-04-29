package finalExam;

public class E25BinaryNumbers {

    public static void main(String[] args) {
        printBinary(3);
    }

    private static void printBinary(int bits) {
        binaryHelper(bits, "");
    }

    private static void binaryHelper(int bits, String soFar) {
        if (bits == 0) {
            System.out.println(soFar);
        } else {
            // 2 decisions either a 0 or 1
            binaryHelper(bits - 1, soFar + "0");
            // Unchoose - no need to do anything here since,
            // we made no permanent changes to our problem parameters

            binaryHelper(bits - 1, soFar + "1");

        }
    }

}
