public class Multiplecatchdemo {
    public static void main(String[] args) {
        int c;
        int[] b = new int[10]; // Correct array declaration
        int a = Integer.parseInt(args [0]);

        try {
            if (a % 2 == 0) {
                c = 10 / 0; // This will cause ArithmeticException
            } else {
                b[15] = 20; // This will cause ArrayIndexOutOfBoundsException
            }
        } catch (ArithmeticException el) {
            System.out.println("Exception is: " + el);
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Exception is: " + e2);
        }

        System.out.println("Out of all try-catch blocks");
    }
}
