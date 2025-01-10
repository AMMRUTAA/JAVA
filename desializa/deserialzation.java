
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class deserialzation {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\Testfile.txt";

        try{ 
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            student obj = (student) ois.readObject();
            System.out.println(obj.stuRollNo);
            System.out.println(obj.stuName);
            ois.close();
            fis.close(); 
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
