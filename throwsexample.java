public class throwsexample {
    static void method1()throws IllegalAccessException{
        System.out.println("Inside method1");
        throw new IllegalAccessException("ONE");
    }
    public static void main(String args[])
    {
        try {
            method1();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("IllegalAccessException"+e);

        }
    }
    
}
