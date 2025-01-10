
public class finally_demo {
    static void procA()
    {
        try 
        {
            System.out.println("Inside ProcA");
            throw new RuntimeException("demo");   
        }
        finally 
        {
            System.out.println("ProcA finally");

        }
    }
     static void procB()
     {
        try{
            System.out.println("Inside ProcB");
            return;
        }
        finally
        { System.out.println("ProcB finally");}
     }
    static void procC()
    {
        try {
            System.out.println("Inside ProcC");
            return;
        }
        finally 
        {
            System.out.println("ProcC finaaly");
        }
    }
    public static void main(String args[])
    {
        try 
        {
            procA();
        }
        catch(Exception e){
            System.out.println("Exception caught"+e);
        }
        procB();
        procC();
    }
}