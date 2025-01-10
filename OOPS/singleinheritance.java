package OOPS;
class AB
{
    public int i,j;
    public void showbase()
    {
        System.out.println("iand j of base class are "+i+"and "+j);

    }
}
class BA extends AB {
    public int k;
    public void showderived()
    {
        System.out.println("k of derived class is"+k);
    }
    public void addal()
    {
        System.out.println("i+j+k="+(i+j+k));
    }
}
public class singleinheritance {
    public static void main(String [] args)
    {
    AB ai = new AB();
    BA bi = new BA();
    System.out.println("using object of base class");
    ai.i = 4;
    bi.j = 6;
    ai.showbase();
    System.out.println("using object of derived class");
    bi.i = 10;
    bi.j = 11;
    bi.k = 12;
    bi.showbase();
    bi.showderived();
    System.out.println("showing addtion of all");
    bi.addal(); 
}
}
