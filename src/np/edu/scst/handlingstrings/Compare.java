package np.edu.scst.handlingstrings;

public class Compare {
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "Welcome";
        String str3 = new String("Welcome");
        
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
