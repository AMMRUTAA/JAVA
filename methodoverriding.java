
 

class  add{
    public void getresult(int a,int b)
    {
        System.out.println("Sum of "+ a + " and " + b+ " is " + (a+b));
    }
}
class multiply extends add{
    public void  getresult (int a,int b)
    {
        System.out.println("Multipication of " + a + "and " + b + " is" + (a*b));
    }  
    }
    class Divide extends multiply
{
    public void getresult(int a,int b)
    {
        System.out.println("division of " + a+ " and " + b + " is " + (a/b));
    }
}
/**
 * methodoverriding
 */
public class methodoverriding {
public static void main (String args[])
{
    Divide d = new Divide();
    d.getresult(12,4);
}
    
}

    

