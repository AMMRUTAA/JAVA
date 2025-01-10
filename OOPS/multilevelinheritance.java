package OOPS;

class A  
{
    public void set()
    {
        System.out.println("This is set of class A");
    }
}

class B extends A {
    public void get()
    {
        System.out.println("This is get of class B");
    }
}

class C extends B  
{
    public void check()
    {
        System.out.println("This is check of class C");
    }
}

public class multilevelinheritance {
    public static void main (String[] args)
    {
        A al = new A();
        System.out.println("Using object of base class A");
        al.set();
        
        B bl = new B();
        System.out.println("Using object of base class B");
        bl.set();
        bl.get();
        
        C cl = new C();
        System.out.println("Using object of base class C");
        cl.set();
        cl.get();
        cl.check();
    }
}
