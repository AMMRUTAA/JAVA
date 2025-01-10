// Class definition for method overloading
public class methodoverloading {
    // Method without parameter
    public void mymethod() {
        System.out.println("This is without parameter list");
    }

    // Method with one int parameter
    public void mymethod(int x) {
        System.out.println("This is with one int parameter");
    }

    // Method with one float parameter
    public void mymethod(float y) {
        System.out.println("This is with one float parameter"); // Added missing semicolon
    }

    // Method with one string parameter
    public void mymethod(String s) {
        System.out.println("This is with one string parameter");
    }
}

// Demo class to test method overloading
class methodoverloadingDemo {
    public static void main(String args[]) {
        methodoverloading m1 = new methodoverloading(); // Changed method_demo to methodoverloading

        // Calling different versions of the mymethod
        m1.mymethod(); // Without parameter
        m1.mymethod(45); // With int parameter
        m1.mymethod(148.95f); // With float parameter
        m1.mymethod("learning"); // With string parameter
    }
}
