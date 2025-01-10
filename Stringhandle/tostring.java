
class circle{
    double a,c;
    circle(double ar, double cir) {
        a = ar;
        c = cir;
    }
    public String toString() {
        return("Area of circle is " +a+ "and circumference of circle is " +c+ ".");
    }      
}
public class tostring {

    public static void main(String[] args) {
        circle c = new circle(2.44, 15.927);
        String st = "Circle c :" +c;
        System.out.println(c);
        System.out.println(st);
    }
}
