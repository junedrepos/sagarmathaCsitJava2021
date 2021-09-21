package np.edu.scst.classnobject.abstraction.abstractclass;

public class Child extends Parent{

    @Override
    public void absMethod() {
        System.out.println("some implementation");
    }
    
    public static void main(String[] args) {
//        Parent p = new Parent();
//        object of a abstract class cannot be made
        Child c = new Child();
        c.absMethod();
        c.normalMethod();
    }
    
}
