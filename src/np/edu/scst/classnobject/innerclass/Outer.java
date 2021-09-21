package np.edu.scst.classnobject.innerclass;

public class Outer {
    
    class Inner{
        int i = 10;
        public void getI(){
            System.out.println("The value of I is "  + i);
        }
    }
    
    public void getInnerClassValue(){
        Inner in = new Inner();
        in.getI();
    }
}
