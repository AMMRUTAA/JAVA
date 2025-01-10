package OOPS;

class S {
    public void set() {
        System.out.println("This is set of base class A");
    }
}

class D extends S {
    @Override
    public void set() {
        System.out.println("This is set of derived class B");
    }

    public void demo() {
        System.out.println("Calling set() from derived class");
        set(); // Calls the overridden method in B
        System.out.println("When called using super keyword:");
        super.set(); // Calls the method from base class A
    }
}

public class overriding {
    public static void main(String[] args) {
        D b1 = new D();
        b1.demo();
    }
}
