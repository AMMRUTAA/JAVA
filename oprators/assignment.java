package oprators;

public class assignment {
    public static void main(String args[])
    {
        int x=10,y=20;
        int z=x++;
        int m=++x;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("x++="+z); 
        System.out.println("++x="+m);
        System.out.println("x+=y=" +(x+=y));
        System.out.println("x-=y="+(x-y));
        System.out.println("x*=y="+(x*=y));
        System.out.println("x/=y="+(x/=y));
    }
}
