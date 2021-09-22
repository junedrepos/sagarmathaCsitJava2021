package np.edu.scst.abstraction;

public class ChildOfInterface implements InterfaceName{
    
    @Override
    public void method1() {
        System.out.println("redefined method 1");
    }

    @Override
    public void method2() {
         System.out.println("redefined method 2");
     }
    
    public static void main(String[] args) {
        ChildOfInterface coi = new ChildOfInterface();
        coi.method1();
        coi.method2();
    }
        
}
