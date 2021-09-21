package np.edu.scst.classnobject.nestedinnerclass;

public class Outer {
    int outerVar = 10;
    
    class Inner{
        public void innerMethod(){
            System.out.println("hello from inner method");
        }
    }
    
    public void getInnerMethod(){
        Inner in = new Inner();
        in.innerMethod();
    }
    
}
