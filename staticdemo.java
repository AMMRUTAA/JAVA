class StaticClass
{
    static int x;
    static int y=5;
    public static void show ()
    {
        System.out.println("Static data member x=" +x);
        System.out.println("Static data member y=" +y);
    }   
}


public class staticdemo {
    public static void main(String[] args) {
        System.out.println("Calling static member function show() of class StaticClass");
        StaticClass. show();
        System.out.println("Value of Static data member x of class Staticclass :"+StaticClass.x);
        System.out.println("Value of static data member y of class StaticClass:"+StaticClass.y);

    }
}

