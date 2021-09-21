package np.edu.scst.classnobject.passbyvaluerefernce;

public class PassByReference {
    public static void changeName(Mobile mob){
        mob.model ="x1";
    }
    public static void main(String[] args) {
        Mobile nokia = new Mobile();
        nokia.model = "n1";
        changeName(nokia);
        System.out.println(nokia.model);
        
    }
}

class Mobile {
    String model;
}

