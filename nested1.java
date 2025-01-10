public class nested1 {
    public static void main(String args[])
{
    System.out.println("Your first agrument is:"  +args[0]);
    System.out.println("Your Second agrument is:" +args[1]);
    int n = args.length;

    try{
        System.out.println("n=" +n);
        int m=4/n;
        System.out.println("m=" +m);
        if(m==1)
        {
            n=n/(n-n);
        }
        else if(m==2){
            int p[]= {2,4};
            p[4]=23;
        }
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array Index Error" +e);
    }
    catch (ArithmeticException e)
    {
        System.out.println("Divsion by zero");
    }
}
}
