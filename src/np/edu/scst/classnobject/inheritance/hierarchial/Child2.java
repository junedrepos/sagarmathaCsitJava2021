package np.edu.scst.classnobject.inheritance.hierarchial;
public class Child2 extends Parent{
    int propertyC2=10000;
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        System.out.println(c2.propertyC2);
        System.out.println(c2.propertyP);
        //System.out.println(c2.propertyC1);
        
    }
}
