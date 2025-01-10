
public class Equalsdemo {
    public static void main(String[] args) {
        String s1 = "james";
            String s2 ="James";
            String s3 = "Good-Day";
            String s4 = "James";
            System.out.println(s1 + "equals" +s2+ "=" +s1.equals(s2));
            System.out.println(s1 + "equals" +s3+ "=" +s1.equals(s3));
            System.out.println(s1 + "equals" +s4+ "=" +s1.equals(s3));
            System.out.println(s1 + "equalsignorecase" +s4+ "=" +s1.equalsIgnoreCase(s4));
    }
}
