package np.edu.scst.classnobject.inheritance.hierarchial;
public class Child1 extends Parent{
    int propertyC1=1000;
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        System.out.println(c1.propertyC1);
        System.out.println(c1.propertyP);
        //System.out.println(c1.propertyC2);
    }
}
