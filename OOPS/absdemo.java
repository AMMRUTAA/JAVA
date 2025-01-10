package OOPS;
abstract class VJ
{
    abstract void set (int x);
    void get()
    {
        System.out.println("This is a normal method of abtract class A");
    }
}
class BJ extends VJ {
  public  void set(int x)
    {
        System.out.println("Abstract method is overridden in derived class");
    }
    void check()
    {
        System.out.println("This is normal method of abstrct class A");
    }
}
public class absdemo {
 public static void main(String[] args) {
    BJ bl = new BJ();
    bl.get();
    bl.set(4);
    bl.check();
 }   
    
}
