package np.edu.scst.classnobject.inheritance.multilevel;

public class GrandChild extends Child{
    int propertyG = 10000;
    public static void main(String[] args) {// propertyC propertyP inherited
        GrandChild gc = new GrandChild();
        System.out.println(gc.propertyG);
        System.out.println(gc.propertyC);
        System.out.println(gc.propertyP);
    }
}
