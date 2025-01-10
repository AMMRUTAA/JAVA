public class ThrowExample {  // Renamed class
    static void method() {
        try {
            throw new ArithmeticException("one");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
            throw e;  // Rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("Recaught: " + e);
        }
    }
}


