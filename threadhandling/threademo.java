package threadhandling;
class A extends Thread 
{
    public void run()
    {
        for (int i=0; i<=5;i++)
        {
            System.out.println("i=" +i);
        }
        System.out.println("Exit A");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=0;j<=5;j++)
        {
            System.out.println("j=" +j);
        }
        System.out.println("exit B");

    }
}
class C extends Thread 
{
    public void run()
    {
        for (int k=0;k<=5;k++)
        {
            System.out.println("k=" +k);
        } 
        System.out.print("Exit C");
    }
}

public class threademo {
    public static void main (String args[])
    {
        A a=new A();
        a.start();
        
        B b=new B();
        b.start();
        
        C c=new C();
        c.start();

    }
} 

