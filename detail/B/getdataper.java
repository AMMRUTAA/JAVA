package detail.B;
import java.util.Scanner;
public class getdataper
 {
    public void get_data()
    {
        System.out.println("Enter Nmae");
        Scanner sc= new Scanner(System.in);
        String name =sc.nextLine();
        System.out.println(" Enter age");
        int age = sc.nextInt();
        System.out.println("Name ="+name+ "\n" +"age ="+age);
    } 
}
