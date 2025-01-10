
public class constructor {
    public static void main(String[] args) {
         char c[] = {'j' , 'a' , 'm' , 'e' ,'s'};
         String s1 = new String(c);
         String s2 = new String(s1);
         System.out.println(s1);
         System.out.println(s2);
         byte ascii [] = {65,66,67,68,69,70};
         String s3 = new String(ascii);
         System.out.println(s3);
         String s4 = new String(ascii,2,3);
         System.out.println(s4);
    }
}
