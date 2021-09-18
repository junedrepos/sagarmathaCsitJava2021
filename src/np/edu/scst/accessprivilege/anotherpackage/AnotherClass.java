package np.edu.scst.accessprivilege.anotherpackage;

import np.edu.scst.accessprivilege.AccessSpecifier;

public class AnotherClass extends AccessSpecifier{
    public static void main(String[] args) {
        AccessSpecifier as = new AccessSpecifier();
        System.out.println(as.varPublic);
        System.out.println(as.varDefault);
       
        System.out.println(as.varProtected);
        System.out.println(as.varPrivate);
        System.out.println(as.getPrivateVariable());
        
         AnotherClass ac  = new AnotherClass();
        System.out.println(ac.varProtected);
        System.out.println(ac.varPrivate);
        
    }
}
