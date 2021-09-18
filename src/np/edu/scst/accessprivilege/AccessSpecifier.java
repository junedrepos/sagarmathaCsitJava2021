package np.edu.scst.accessprivilege;

public class AccessSpecifier {
    public int varPublic = 10;
     int varDefault = 10;// default access modifier
    protected int varProtected = 10;
    private int varPrivate = 101;
    
    public int getPrivateVariable(){
        return varPrivate;
    }
    
    public static void main(String[] args) {
         AccessSpecifier as = new AccessSpecifier();
        System.out.println(as.varPublic);
        System.out.println(as.varDefault);
        System.out.println(as.varProtected);
        System.out.println(as.varPrivate);
    }
}
class Test{
    public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
         System.out.println(as.varPublic);
        System.out.println(as.varDefault);
        System.out.println(as.varProtected);
        System.out.println(as.varPrivate);
        System.out.println(as.getPrivateVariable());
    }
}
