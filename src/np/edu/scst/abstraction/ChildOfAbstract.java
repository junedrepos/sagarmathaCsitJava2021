package np.edu.scst.abstraction;

public class ChildOfAbstract extends AbstractClass{
    
    @Override
    public void withdraw(){//declaration
        System.out.println("method 2"); //definition
    }
     @Override
    public void passChange() {
         System.out.println("method 3");
    }
    public static void main(String[] args) {
        ChildOfAbstract coa = new ChildOfAbstract();
        coa.method1();
        coa.method2();
    }

   
}
