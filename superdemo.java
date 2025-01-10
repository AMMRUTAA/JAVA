class Demo {
    private int x; // Add private field to store the value

    // Constructor of Demo class
    public Demo(int x) {
        this.x = x;
        System.out.println("Received " + x + " from the base class");
    }
}

class Over extends Demo {
    // Constructor of Over class
    public Over() {
        super(4);  // Call the constructor of the base class Demo with argument 4
        System.out.println("Printing from derived class");
    }
}

public class superdemo {
    public static void main(String[] args) {
        System.out.println("Calling the constructor of derived class");
        Over b1 = new Over();  // This will now correctly call the constructors
        System.out.println("Printing from derived class");
    }
}
