import java.io.FileOutputStream;

public class fileoutputstreamExample {
   public static void main(String[] args) {
    try{
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        fout.write('H');
        fout.close();
        System.out.println("Success");
    }catch(Exception e){
        System.out.println(e);
    }
   } 
}
