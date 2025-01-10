
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;

class student implements Serializable {  // Implement Serializable interface
    int stuRollNo;
    String stuName;
}
public class serialization {
    public static void main(String[] args) {
        student s1 = new student();
        s1.stuRollNo = 50;
        s1.stuName = "pradeep";
        String fileName = "C:\\Users\\amrutaaushikar\\OneDrive\\Desktop\\Testfile.txt";
        
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("object saved in file");
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}